package batch_4.rest;

public class MiddleOne {
	public String fetch(String s) {
		String s1[] = s.split(" ");
		String op="";
		for(String str:s1) {
			int i=str.length();
			int n = (str.length()/2);
			if(i%2==0) {
				op+=str.charAt(n-1);
				op+=str.charAt(n);
			}
			else {
				op+=str.charAt(n);
			}
		}
		return op;
	}

}
