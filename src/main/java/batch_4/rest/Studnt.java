package batch_4.rest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Studnt implements Serializable{
	
	int id;
	String name;
	String course;
	int fee;
	public Studnt(int id, String name, String course, int fee) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
		this.fee = fee;
	}
	public Studnt() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public String objToFile() throws Exception {
		
		Studnt s[] = new Studnt[4];
		
		
		
		Studnt s1 = new Studnt(100,"Sai","java",5000);
		Studnt s2 = new Studnt(101,"Susmitha","sql",7000);
		Studnt s3 = new Studnt(102,"Sandy","iam",8000);
		Studnt s4 = new Studnt(103,"Vincy","database",9000);
	
		s[0] = s1;
		s[1] = s2;
		s[2] = s3;
		s[3] = s4; 
		
		FileOutputStream fout = new FileOutputStream("D:/batch4/ObjArray.txt");
		ObjectOutputStream oout = new ObjectOutputStream(fout);
		oout.writeObject(s);
		return "data saved";
		
	}
	@Override
	public String toString() {
		return "Studnt [id=" + id + ", name=" + name + ", course=" + course + ", fee=" + fee + "]";
	}
	public String fileToObj() throws Exception {
		FileInputStream fin = new FileInputStream("D:/batch4/ObjArray.txt");
		ObjectInputStream oin = new ObjectInputStream(fin);
		Studnt s[] = (Studnt[])oin.readObject();
		
		String st = "";
		for (int i = 0; i < s.length; i++) {
			st+=s[i].toString()+"<br>";
		}
		return st;
	}
}
