package com.pack;

public class Wednesday {
	
	String mail;
	public String samp(String mail) {
		
		if(!(mail.contains("@"))&&!(mail.contains("."))) {
			return "@ and . is missing"; 
		}
		else if(!(mail.contains("@"))) {
			return "@ is missing in the mail";
		}
		else if(!(mail.contains("."))) {
			return ". is missing in the mail";
		}
		else {
			return mail;
		}
	}
}
