package edu.duke.mc.cfm.dci.infobutton;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import edu.duke.mc.cfm.dci.infobutton.schemas.kb.Context;
import edu.duke.mc.cfm.dci.infobutton.schemas.kb.KnowledgeResourceProfile;

public class ContextProfileHandler {

	Logger log = Logger.getLogger(ContextProfileHandler.class.getName());
	@Autowired
	ContextMatcher matcher;
	public  List<KnowledgeResourceProfile> profiles;
	public  ResourceProfileProvider provider;
	@Autowired
	public  KnowledgeRequest request;
	public  List<RequestResult> results;
	private  void initProfiles() {
		provider = ResourceProfileProvider.getInstance();
		profiles = provider.getProfiles();
	}
	
	public List<RequestResult> handleRequest(KnowledgeRequest r) {
		initProfiles();
		results = new ArrayList<RequestResult>();
		request = r;
		KnowledgeResourceProfile profile;
		for (int i=0;i<profiles.size();i++) {
			profile = profiles.get(i);
			results.add(matchContexts(profile));
		}
		provider.resetInstance();
		return results;
	}
	
	/**
	 * The contexts in a profile are matched against the request.If successful the context is added to the result.
	 * @param profile
	 * @return RequestResult
	 */
	private  RequestResult matchContexts (KnowledgeResourceProfile profile) {
		log.debug("Matching profile... "+profile.getHeader().getTitle());
		RequestResult result = new RequestResult(profile);
		List<String> supportedCodeSystems = result.getSupportedCodeSystems();
		log.debug("		SupportedCS "+supportedCodeSystems);
		List<Context> contexts = profile.getProfileDefinition().getContexts().getContext();
		int count = contexts.size();
		Context context;
		for (int x = 0; x < count; x++) {
			log.debug("\tMatching Context Started...");
			context = contexts.get(x);
			matcher = new TaskContextMatcher(context.getContextDefinition().getTask(),request,supportedCodeSystems); 
			if (!matcher.MatchContext()) {
				log.debug("\t\tTaskContextMatcher FAILED");
				continue;
			}
			matcher = new PerformerMatcher(context.getContextDefinition().getPerformerLanguage(), 
					context.getContextDefinition().getPerformerDiscipline(), context.getContextDefinition().getPerformerKnowledgeUserType(), 
					request,supportedCodeSystems);
			if (!matcher.MatchContext()) {
				log.debug("\t\tPerformerMatcher FAILED");
				continue;
			}
			matcher = new InformationRecipientMatcher(context.getContextDefinition().getInformationRecipientLanguage(), 
					context.getContextDefinition().getInformationRecipientDiscipline(), context.getContextDefinition().getInformationRecipientUserType(),
					request,supportedCodeSystems);
			if (!matcher.MatchContext()) {
				log.debug("\t\tInformationRecipientMatcher FAILED");
				continue;
			}
			matcher = new EncounterMatcher(context.getContextDefinition().getEncounterType(), context.getContextDefinition().getServiceDeliveryLocation(),
					request,supportedCodeSystems);
			if (!matcher.MatchContext()) {
				log.debug("\t\tEncounterMatcher FAILED");
				continue;
			}
			matcher = new PatientContextMatcher(context.getContextDefinition().getPatientGender(), 
					context.getContextDefinition().getPatientAgeGroup(), request,supportedCodeSystems);
			if (!matcher.MatchContext()) {
				log.debug("\t\tPatientContextMatcher FAILED");
				continue;
			}
			matcher = new MainSearchCriteriaMatcher(context.getContextDefinition().getConceptOfInterest(), request,supportedCodeSystems);
			if (!matcher.MatchContext()) {
				log.debug("\t\tMainSearchCriteriaMatcher FAILED");
				continue;
			}
			log.debug("\t\tAdding Context to result...");
			result.addResult(context);
		}
		return result;
	}
}
