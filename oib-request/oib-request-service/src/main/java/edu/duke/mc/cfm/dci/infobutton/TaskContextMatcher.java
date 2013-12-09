package edu.duke.mc.cfm.dci.infobutton;

import java.util.List;

import edu.duke.mc.cfm.dci.infobutton.schemas.kb.Code;
import edu.duke.mc.cfm.dci.infobutton.schemas.kb.CodedContextElement;


public class TaskContextMatcher extends ContextMatcher{

	public TaskContext taskContext;
	public CodedContextElement context;
	KnowledgeRequest request;
	List<String> supportedCodeSystems;
	
	public TaskContextMatcher(CodedContextElement context,
			KnowledgeRequest request, List<String> supportedCodeSystems) {
		this.context = context;
		this.taskContext = request.getTaskContext();
		this.supportedCodeSystems = supportedCodeSystems;
	}

	@Override
	public Boolean MatchContext() {
		Boolean match = false;
		Code code = taskContext.getCode();
		match = CodeMatch(code,context,supportedCodeSystems,false,request);
		return match;
	}
}
