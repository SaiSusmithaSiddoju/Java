package batch_4.rest;

public class Outer {
	
	int x = 20;
	
	static class Inner{
		
		 int y = 30;
	}
	
	int getmsg(){
		
		class MethInn{
			int z = 40;
		}
	
		MethInn mn = new MethInn();
		return mn.z;
	}

}
