package batch_4.rest;

import java.io.FileOutputStream;

public class FileAdd {
	
	public String add(int a,int b) throws Exception {
		FileOutputStream out = new FileOutputStream("D:/batch4/myfil.txt",true);
		String data1 = "First Data is : "+a+" ";
		out.write(data1.getBytes());
		String data2 = "Second Data is : "+b+" ";
		out.write(data2.getBytes());
		String c = "result : "+(a+b);
		out.write(c.getBytes());
		return "result saved";
	}
}
