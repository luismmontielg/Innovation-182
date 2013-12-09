package edu.duke.mc.cfm.dci.infobutton;

import org.hl7.v3.REDSMT010001UVTaskContext;

import edu.duke.mc.cfm.dci.infobutton.schemas.kb.Code;

public class TaskContext {
	
	private Code code;
	public TaskContext (String code, String codeSystem, 
			String displayName, String codeSystemName) {
		this.code=CodeUtility.getCode(code,codeSystem,displayName,codeSystemName);
	}
	
	public TaskContext (Code code) {
		this.code = code;
	}
	
	public TaskContext (REDSMT010001UVTaskContext taskContext) {
		this.code=CodeUtility.getCode(taskContext.getCode());
	}
	
	public TaskContext() {
		this(CodeUtility.getCode());
	}
	
	public Code getCode() {
		
		return this.code;
	}
	
	public void setCode(Code code) {
		
		this.code = code;
	}
	
	public static REDSMT010001UVTaskContext getJAXBElement(TaskContext taskContext) {
		REDSMT010001UVTaskContext jaxBElement = new REDSMT010001UVTaskContext();
		
/*      jaxBElement.setCode(Code.getJAXBElement(taskContext.getCode()));
 * 		edu.duke.mc.cfm.dci.infobutton.Code had a few methods to do these transformations
 * 		but to maintain uniformity throughout the project, now only the Code-class from 
 * 		infobutton-kbschema is used.
 * 
 */
		jaxBElement.setCode(CodeUtility.getJAXBElement(taskContext.getCode()));
		return jaxBElement;
	}
	
}
