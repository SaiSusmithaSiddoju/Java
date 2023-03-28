package batch_4.rest;

import java.util.Arrays;

public class Sorting {
	
	public String arrange(String s) {
		char ch[] = s.toCharArray();
		Arrays.sort(ch);
		return (new String(ch));
	}

}
