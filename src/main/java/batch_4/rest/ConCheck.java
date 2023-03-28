package batch_4.rest;

public class ConCheck {
	
	private ConCheck() {
		
	}
	 int a = 10;
	public String disp() {
		return "Private Constructor";
		
	}
	
	public static ConCheck createObj() {
		return new ConCheck();
		
	}

}
