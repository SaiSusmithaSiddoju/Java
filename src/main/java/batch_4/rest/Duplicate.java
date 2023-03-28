package batch_4.rest;

public class Duplicate {
	
	public String removeDuplicate(String s) {
		char ch[] = s.toCharArray();
		String str="";
	
		for(int i = 0;i<ch.length;i++) {
			if(!s.contains(ch[i]+"")) {
				str+=ch[i];
			}
			//break;
			//str+=s.charAt(i);
		}
	
		
		
		
		return str;//.replaceAll("\\s", "");
	
	}

}
