import javax.ws.rs.PathParam;

public class UnderScoreMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "saisusmitha";
		int n = 2;
			char a[] = s.toCharArray();
				char und='_';
				for(int i=0;i<a.length;i++) {
					if(i%n==0) {
					//	char temp = 
						a[n-1]+=und;
					}
					else if(s.length()>n) {
						a[a.length+1]+=und;
					}			
			}
				System.out.println(new String(a));
	}
	public static class Sai{
		
	}
}

