package batch_4.rest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.zip.DeflaterInputStream;
import java.util.zip.InflaterInputStream;

public class FileOp {
	
	public String loadData(String fileName) throws Exception {
		
		FileOutputStream out = new FileOutputStream("D:/batch4/"+fileName+".txt",true);
		String data = "Hope all are doing good";
		out.write(System.lineSeparator().getBytes());
		out.write(data.getBytes());
		return "Data Saved";
		
	}
	
	public String readData(String fileName) throws Exception {
		
		FileInputStream in = new FileInputStream("D:/batch4/"+fileName+".txt");
		int ch = in.read();
		String data = "";
		while(ch!=-1) {
			if(ch==13)
			data+="<br>";
			data+=(char)ch;
			ch = in.read();
		}
		return data;
	}
	public String  compress() throws Exception {
		FileInputStream in = new FileInputStream("D:/batch4/painting.jpg");
		DeflaterInputStream din = new DeflaterInputStream(in);
		FileOutputStream out = new FileOutputStream("D:/batch4/compress.txt");
		int ch=din.read();
		while(ch!=-1) {
			out.write(ch);
			ch=din.read();
			}
		
		return "compressed";
	}
	public String  decompress() throws Exception {
		FileInputStream in = new FileInputStream("D:/batch4/compress.txt");
		InflaterInputStream iin = new InflaterInputStream(in);
		FileOutputStream out = new FileOutputStream("D:/batch4/decompress.jpg");
		int ch=iin.read();
		while(ch!=-1) {
			out.write(ch);
			ch=iin.read();
			}
		
		return "decompressed";
	}
	public String  decompressDurga() throws Exception {
		FileInputStream in = new FileInputStream("C:\\Users\\user\\Downloads\\Untitled.txt");
		InflaterInputStream iin = new InflaterInputStream(in);
		FileOutputStream out = new FileOutputStream("D:/batch4/decompress_durga.jpg");
		int ch=iin.read();
		while(ch!=-1) {
			out.write(ch);
			ch=iin.read();
			}
		
		return "decompressed Durga";
	}
	public String  decompressTeja() throws Exception {
		FileInputStream in = new FileInputStream("C:\\Users\\user\\Downloads\\compress.txt");
		InflaterInputStream iin = new InflaterInputStream(in);
		FileOutputStream out = new FileOutputStream("D:/batch4/decompress_teja.jpg");
		int ch=iin.read();
		while(ch!=-1) {
			out.write(ch);
			ch=iin.read();
			}
		
		return "decompressed Teja";
	}
	public String  decompressLav() throws Exception {
		FileInputStream in = new FileInputStream("C:\\Users\\user\\Downloads\\compress lav.txt");
		InflaterInputStream iin = new InflaterInputStream(in);
		FileOutputStream out = new FileOutputStream("D:/batch4/decompress_lav.jpg");
		int ch=iin.read();
		while(ch!=-1) {
			out.write(ch);
			ch=iin.read();
			}
		
		return "decompressed Lav";
	}
	
public String printLine() throws Exception {
		
		FileOutputStream out = new FileOutputStream("D:/batch4/PrintLine.txt",true);
		String data1 = "Sai Susmitha";
		out.write(System.lineSeparator().getBytes());
		out.write(data1.getBytes());
		String data2 = "Sai Durga";
		out.write(System.lineSeparator().getBytes());
		out.write(data2.getBytes());
		String data3 = "Sai Teja";
		out.write(System.lineSeparator().getBytes());
		out.write(data3.getBytes());
		String data4 = "Lavanya";
		out.write(System.lineSeparator().getBytes());
		out.write(data4.getBytes());
		String data5 = "Vandhana";
		out.write(System.lineSeparator().getBytes());
		out.write(data5.getBytes());
		String data6 = "Ankitha";
		out.write(System.lineSeparator().getBytes());
		out.write(data6.getBytes());
		String data7 = "Ram";
		out.write(System.lineSeparator().getBytes());
		out.write(data7.getBytes());
		String data8 = "Rutwik";
		out.write(System.lineSeparator().getBytes());
		out.write(data8.getBytes());
		
		return "Data Saved";
		
	}

public String readline(int linenum) throws Exception {
	
	FileInputStream in = new FileInputStream("D:/batch4/PrintLine.txt");
	int ch = in.read();
	int count=0;
	String data = "";
	while(ch!=-1) {
		if(ch==13) {
			count++;
		}
		if(count==linenum-1) {	
		data+=(char)ch;
		}
		ch = in.read();
	}
	return data;
}

	public String variables(String elt) throws Exception {
		
		FileInputStream in = new FileInputStream("D:/batch4/Variables.txt");
		int ch = in.read();
		String data = "";
		while(ch!=-1) {
			data+=(char)ch;
			ch = in.read();
		}
			String st="";
			String ar[]=data.split("\n");
			for(String s:ar)
			if(s.substring(0,s.indexOf('=')).equals(elt.toLowerCase())) {
				st=s.substring(s.indexOf('=')+1);
			}
			if(st.length()==0)
				return "No Data";
			else
				return st;
	}
	
	public String arrayFile() throws Exception {
		int a[] = {10,20,30,40,50};
		String s = Arrays.toString(a);
		FileOutputStream fout = new FileOutputStream("D:/batch4/ArrayFile.txt");
		fout.write(s.getBytes());
		return "data saved";
	}
	public String printIndex(int ind) throws Exception {
		FileInputStream fin = new FileInputStream("D:/batch4/ArrayFile.txt");
		int ch = fin.read();
		String data ="";
		while(ch!=-1) {
			if(ch!=91&&ch!=93) {
				data+=(char)ch;
			}
			ch = fin.read();
		}
		System.out.println(data);
		String st="";
		String a[]=data.split(",");
		for (int i = 0; i < a.length; i++) {
			if(i==ind) {
				st+=a[i];
			}
		}
		return st;
	}
	public String rename(String f1name,String f2name) {
		File f = new File("D:/batch4/"+f1name+".txt");
		File ff = new File("D:/batch4/"+f2name+".txt");
		f.renameTo(ff);
		return "Executed";
	}
	public String copyFile() throws Exception {
		File f1=new File("D:/batch4/myfile.txt");
		File f2=new File("D:/batch4/copy/"+f1.getName());
		FileInputStream in=new FileInputStream(f1);
		FileOutputStream out=new FileOutputStream(f2);
		int ch=in.read();
		while(ch!=-1) {
			out.write(ch);
			ch = in.read();
		}
		return "File Copied";
	}
	public String cutFile() throws Exception {
		File f1=new File("D:/batch4/copy/myfile.txt");
		File f2=new File("D:/batch4/cut/"+f1.getName());
		FileInputStream in=new FileInputStream(f1);
		FileOutputStream out=new FileOutputStream(f2);
		int ch = in.read();
		while(ch!=-1) {
			out.write(ch);
			ch=in.read();
		}
		in.close();
		f1.delete();
		return "Cut and Copied";
	}
		
	
}
