package edu.utah.openinfobutton.externalresource.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import edu.duke.mc.cfm.dci.infobutton.schemas.kb.Code;
import edu.duke.mc.cfm.dci.infobutton.schemas.kb.Id;
import edu.duke.mc.cfm.dci.infobutton.schemas.kb.TerminologyInference.CodeInference.InferenceDefinition.LocalMappings.Mapping;
import edu.utah.further.subsetdb.domain.Concept;
import edu.utah.further.subsetdb.domain.Subset;
import edu.utah.further.subsetdb.service.SubsetDbDao;
import edu.utah.openinfobutton.externalresource.api.ExternalResourceHandler;
import edu.utah.openinfobutton.externalresource.api.TerminologyHandler;

public class LocalTerminologyHandler implements TerminologyHandler {

	@Autowired
	private SubsetDbDao dao;
	@Autowired
	ExternalResourceHandler handler;
	@Autowired
	TerminologyMappings terminologyMappings;
	List<Mapping> validMappings;
	public Boolean isSubsetMember(Code code,List<Id> subsetIdList) {
		
		Boolean match = false;
		Concept concept = dao.getConceptByCodeAndCodeSystem(code.getCode(), code.getCodeSystem());
		for(Id subsetId : subsetIdList)
		{
			Subset subset = dao.getSubsetByName(subsetId.getId());
			if (concept != null && subset != null) {
				match = dao.isConceptInSubset(concept.getId(), subset.getId());
			}
			if(match)
				break;
		}
//		This is no longer necessary as all of the values sets are present in the UofU local OIB.
//		If required, your own implementation can be given.
//		if(!match)
//		{
//			match = handler.matchCodeSet(subsetIdList, code);
//		}		
		return match;
	}

	public Code transformCode(Code code, String codeSystem) {
		// TODO Auto-generated method stub
		validMappings=terminologyMappings.getValidMappings();
		for(int i=0;i<validMappings.size();i++)
		{
			Mapping m=validMappings.get(i);
			if((m.getSourceValue().equals(code.getCodeSystem()))&&(m.getTargetValue().equals(codeSystem)))
			{
				Code transformedCode = handler.transformCode(code,m.getTargetName());
				if(transformedCode!=null)
				{
					transformedCode.setCodeSystem(m.getTargetValue());
					return transformedCode;
				}
			}
		}
		return null;
	}

	public boolean isDescendant(Code code1, Code code2) {
		return handler.isDescendant(code1,code2);
	}
}
