package batch_4.rest;

import java.util.StringTokenizer;

public class Decrypt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "311119";
		String s1 = "abcdefghi";
		String s2 = "jklmnopqr";
		String s3 = "stuvwxyz";
		String sym = "!@#$%&*()_-+=';:,.{}[]?0";
		String sz = "";
		
		for(char ch:s.toCharArray()) {
			if(sym.contains(ch+"")) {
				sz+=ch;
			}
		}
		StringTokenizer st = new StringTokenizer(s,sym);
		int n = st.countTokens();
		String a1[] = new String[n];
		for(int i=0;i<n;i++) {
			a1[i]=st.nextToken();
			}
		String res="";
		int j = 0;
		for(String tok:a1) {
			for(int i=0;i<tok.length();i++) {
				if(i%2==0) {
					String pos = tok.charAt(i+1)+"";
					int ind = Integer.parseInt(pos)-1;
				if(tok.charAt(i)=='1') {
					res+=s1.charAt(ind);
				}
				else if(tok.charAt(i)=='2') {
					res+=s2.charAt(ind);
				}
				else if(tok.charAt(i)=='3') {
					res+=s3.charAt(ind);
				}
				}
			}
			if(sz.length()!=0) {
			char chr = sz.charAt(j);
			if(chr=='0') 
				res+=" ";
			
			else 
				res+=chr;
			
			j++;
			}
		}
		System.out.println(res);
	}
}
