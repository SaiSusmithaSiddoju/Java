package batch_4.rest;


import javax.xml.bind.annotation.XmlRootElement;


public class Doctor {
	
	public String heartcheck() {
		return "Heart Check is Done";
	}
}
@XmlRootElement
class Cardio extends Doctor
{
	public String bpcheck() {
		return "BP Check is Done";
	}
}
