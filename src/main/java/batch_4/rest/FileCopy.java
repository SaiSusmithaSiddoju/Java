package batch_4.rest;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopy {
	
	public String copyfiles() throws Exception {
		FileInputStream in = new FileInputStream("D:/batch4/myfile.txt");
		String data = "";
		int ch = in.read();
		while(ch!=-1) {
			data+=(char)ch;
			ch = in.read();
		}
		FileOutputStream out = new FileOutputStream("D:/batch4/myfil.txt");
		out.write(data.getBytes());
		return "data copied";
		
	}

}
