package batch_4.rest;

public class Vote {
	
	int age;
	public String giveVote(int age) {
		
			try {
				if(age<18) {
				throw new LessAgeException("U r not eligible");
				}
				else {
					return "Welcome";
				}
		}
		
		catch (Exception e) {
			// TODO Auto-generated catch block
			return e.getMessage();
		}
		
	}
  
}
