package edu.duke.mc.cfm.dci.infobutton;

import org.hl7.v3.IILite;

/*
$Rev:: 1097          $:  Revision of last commit
$Author:: ai28       $:  Author of last commit
$Date:: 2010-10-01 1#$:  Date of last commit
*/

public class IDLite {
	
	private String root;
	
	private String extension;
	
	private String assigningAuthorityName;
	
	public IDLite(String root, String extension, 
			String assigningAuthorityName) {
		this.root = root;
		this.extension = extension;
		this.assigningAuthorityName = assigningAuthorityName;
	}
	
	public IDLite(IILite id) {
		
		this(id.getRoot(), id.getExtension(), id.getAssigningAuthorityName());
	}
	
	public IDLite() {
		this(new String(), new String(), new String());
	}
	
	public String getRoot () {
		return this.root;
	}

	public String getExtension() {
		return this.extension;
	}
	
	public String getAssigningAuthorityName() {
		return this.assigningAuthorityName;
	}
	
	public void setRoot(String root) {
		this.root = root;
	}
	
	public void setExtension(String extension) {
		this.extension = extension;
	}
	
	public void setAssigningAuthorityName(String assigningAuthorityName) {
		this.assigningAuthorityName = assigningAuthorityName;
	}	
	
	public static IILite getJAXBElement(IDLite id) {
		IILite jaxBElement = new IILite();
		jaxBElement.setRoot(id.getRoot());
		jaxBElement.setExtension(id.getExtension());
		jaxBElement.setAssigningAuthorityName(id.getAssigningAuthorityName());
		return jaxBElement;
	}
}
