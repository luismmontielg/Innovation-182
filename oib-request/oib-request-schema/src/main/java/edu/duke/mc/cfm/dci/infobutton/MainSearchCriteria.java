package edu.duke.mc.cfm.dci.infobutton;

import org.hl7.v3.REDSMT010001UVMainSearchCriteria;

import edu.duke.mc.cfm.dci.infobutton.schemas.kb.Code;

public class MainSearchCriteria {
	
	private Code code;
	private SeverityObservation severityObservation;
	
	
	public MainSearchCriteria (String code, String codeSystem, 
			String displayName, String codeSystemName, Code severityObservation) {
		this.code = CodeUtility.getCode(code, codeSystem, displayName, codeSystemName);
		this.severityObservation = new SeverityObservation(severityObservation);
	}
	
	public MainSearchCriteria (Code code, SeverityObservation severityObservation) {
		this.code = code;
		this.severityObservation = severityObservation;
	}
	
	public MainSearchCriteria (REDSMT010001UVMainSearchCriteria mainSearchCriteria) {
		
		this.code = CodeUtility.getCode(mainSearchCriteria.getValue());
		if (mainSearchCriteria.getSeverityObservation() != null) {
			this.severityObservation = new SeverityObservation(mainSearchCriteria.getSeverityObservation().getValue());
		} else {
			this.severityObservation = new SeverityObservation();
		}
	}
	
	public MainSearchCriteria () {
		
		this(CodeUtility.getCode(), new SeverityObservation());
	}
	
	public Code getCode() {
		
		return this.code;
	}
	
	public void setCode(Code code) {
		
		this.code = code;
	}
	
	public SeverityObservation getSeverityObservation() {
		
		return this.severityObservation;
	}
	
	public void setSeverityObservation(SeverityObservation severityObservation) {
		
		this.severityObservation = severityObservation;
	}
	
	public static REDSMT010001UVMainSearchCriteria getJAXBElement(MainSearchCriteria mainSearchCriteria) {
		REDSMT010001UVMainSearchCriteria jaxBElement = new REDSMT010001UVMainSearchCriteria();
		jaxBElement.setValue(CodeUtility.getJAXBElement(mainSearchCriteria.getCode()));
		jaxBElement.setSeverityObservation(SeverityObservation.getJAXBElement(mainSearchCriteria.getSeverityObservation()));
		return jaxBElement;
	}
}
