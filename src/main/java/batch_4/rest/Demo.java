package batch_4.rest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.zip.InflaterInputStream;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.annotation.XmlRootElement;

import com.pack.Array;
import com.pack.Wednesday;

import batch_4.rest.CheckClass.CheckInner;


@Path("/show")
public class Demo {

	@GET
	@Produces(MediaType.TEXT_HTML)
	public String show() {
		return "<h2>Sai</h2>";
	}

	@GET
	@Path("/print")
	@Produces("text/plain")
	public String print() {
		return "Successfull!";
	}

	@GET
	@Path("/getstudent")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Student> getstdnt() {

		Student s1 = new Student(101, "Sai", "CSE", 50000);
		Student s2 = new Student(102, "Susmitha", "ECE", 30000);
		Student s3 = new Student(103, "Sri", "EEE", 20000);
		Student s4 = new Student(104, "Venky", "Mech", 40000);

		List<Student> s = new LinkedList<Student>();
		s.add(s1);
		s.add(s2);
		s.add(s3);
		s.add(s4);

		return s;
	}
	
	@GET
	@Path("/add/{n1},{n2}")
	@Produces("text/plain")
	public String adding(@PathParam("n1")int x,@PathParam("n2")int y) {
		
		return (x+y)+"";
	}
	
	@GET
	@Path("/table/{n1}")
	@Produces(MediaType.TEXT_HTML)
	public String table(@PathParam("n1")int x) {
		
		String a = "";
		for(int i=1;i<=10;i++)
		{
			a+=x+"*"+i+"="+(x*i)+"<br>";
		}
		
		return a;
	}
	
	@GET
	@Path("/vowel_uppercase/{a}")
	@Produces("text/plain")
	public String m1(@PathParam("a")String a) {
		String a1 = a.toLowerCase();
		/*for(int i=0;i<a1.length();i++)
		{
			if(a1.charAt(i)=='a'||a1.charAt(i)=='e'||a1.charAt(i)=='i'||a1.charAt(i)=='o'||a1.charAt(i)=='u')
			{
				 char result=(char)((int)a1.charAt(i)+32);
				
			}
		}*/
		a1=a1.replace('a', 'A');
		a1=a1.replace('e', 'E');
		a1=a1.replace('i', 'I');
		a1=a1.replace('O', 'O');
		a1=a1.replace('u', 'U');
		
	
			return a1;
	}

	
	@GET
	@Path("/next_char/{a}")
	@Produces("text/plain")
	public String m2(@PathParam("a")String a) {
		String output="";
		for(int i = 0;i<a.length();i++)
		{
			// char ch = a.charAt(i);
			// if(a.charAt(i)=='z') {
				 a=a.replace('z','a'); 
			// }
			// else {
				 output+=(char)((int)a.charAt(i)+1);
				 a=output;
			// }
			 
		}
	
		return a;
	}
	
	@GET
	@Path("/VowConCount/{a}")
	@Produces("text/plain")
	public  String m4(@PathParam("a")String a) {
		a = a.toUpperCase();
		int vowcount = 0;
		int concount = 0;
		for(int i = 0;i<a.length();i++) {
			char ch = a.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				vowcount++;
			}
			else {
				concount++;
			}	
			}
	    return "vowels count is "+vowcount+" "+"consonants count is "+concount;	    
	}
	@GET
	@Path("/display/{d}")
	@Produces("text/plain")
	public String display(@PathParam("d")int d) {
		int a[] = {10,20,30,40,50,60,70,80,90,100};
		String s = "";
		int i = d;
		//for(int i = 0;i<a.length;i++) {
			if(a[i] == 1) {
				s = ""+a[i];
			}
			else if(a[i] == 2) {
				s =""+a[i];
			}
			else if(a[i] == 3) {
				s =""+a[i];
			}
			else if(a[i] == 4) {
				s =""+a[i];
			}
			else if(a[i] == 5) {
				s =""+a[i];
			}
			else if(a[i] == 6) {
				s =""+a[i];
			}
			else if(a[i] == 7) {
				s =""+a[i];
			}
			else if(a[i] == 8) {
				s =""+a[i];
			}
			else if(a[i] == 9) {
				s =""+a[i];
			}
			else if(a[i] == 10) {
				s =""+a[i];
			}
		//}
		return s;
	}
	/*@GET
	@Path("/add/{ad}")
	@Produces("text/plain")
	public int add(@PathParam("ad")String d,String ...x) {
		int sum = 0;
		
		String s[] = d.split(",");
	
		
	}*/
	@GET
	@Path("/comp/{s1},{s2}")
	@Produces("text/plain")
	public String comp(@PathParam("s1") String s1,@PathParam("s2") String s2) {
	//	boolean b;
		 return s1.equals(s2)+"";
		/*if(s1==s2) {
			return "true";
		}
		else {
			return "false";
		}*/
	}
	@GET
	@Path("/comp1/{s1},{s2}")
	@Produces("text/plain")
	public String comp1(@PathParam("s1") String s1,@PathParam("s2") String s2) {
	//	boolean b;
		String str1 = s1;
		String str2 = new String(s2);
		 return str1.equals(str2)+"";
	}
	@GET
	@Path("ten/{x}")
	@Produces("text/plain")
	public String conc(@PathParam("x")int a)  
	{  
	int x=a;    
	String s=String.valueOf(x);    

	return s;
	}
	@GET
	@Path("/substr/{s}")
	@Produces(MediaType.TEXT_HTML)
	public String substr(@PathParam("s")String s){  
		String s1=s;  
		String s2=s;
		s1=s1.substring(2,4);
		s2=s2.substring(2);
		return s1+"<br>"+s2;
		}
	
	@GET
	@Path("/charr/{ca}")
	@Produces(MediaType.TEXT_HTML)
	public String chararr(@PathParam("ca")String s) {
		String ss=s;
		char a[] = ss.toCharArray();
		for(int i=0;i<a.length;i++) {
			char ch=a[i];
		}
		return Arrays.toString(a);
	
	}
	@GET
	@Path("/prac/{ss}")
	@Produces(MediaType.TEXT_HTML)
	public String simp(@PathParam("ss")String s) {
		
	float i = Float.parseFloat(s);
	return i+"";
	}
	@GET
	@Path("/value")
	@Produces(MediaType.TEXT_HTML)
	public String valuemain() {
		ValueSub v = new ValueSub();
		return v.x+"";
	}
	
	@GET
	@Path("/keepunderscore/s/{n}")
	@Produces(MediaType.TEXT_HTML)
	public String keepUnderScore(@PathParam("s")String s,@PathParam("n")int n) {
	char a[] = s.toCharArray();
		char und='_';
		for(int i=0;i<a.length;i++) {
			if(i==n) {
				a[n-1]=und;
			}
			if(i>a.length) {
				a[a.length+1]=und;
			}
				
		}
		return (new String(a));
		
	}
	@GET
	@Path("/lamda/{n1}")
	public String lamda(@PathParam("n1")int n1) {
		SingleInt sq = (x)->{
			return x+" square is "+x*x+"";
		};
		SingleInt eo = (x)->{
			if(x%2==0) {
				return x+" is even";
			}
			else {
				return x+" is odd";
			}
		};
		SingleInt fac = (x)->{
			int i = 1;
			int fact = 1;
			while(i<=n1) {
				fact=fact*i;
				i++;
			}
			return n1+" factorial is "+fact;
		};
		SingleInt c = (x)->{
			return x+" cube is "+x*x*x;
		};
		String square = sq.findIt(n1);
		String evenodd = eo.findIt(n1);
		String factorial = fac.findIt(n1);
		String cube = c.findIt(n1);
		return square+"<br>"+evenodd+"<br>"+factorial+"<br>"+cube;
		
	}
	@GET
	@Path("/remove/{s}")
	public String remodupli(@PathParam("s")String s) {
		Duplicate d = new Duplicate();
		return d.removeDuplicate(s);
	}
	@GET
	@Path("/sort/{s}")
	public String sorting(@PathParam("s")String s) {
		Sorting sor = new Sorting();
		return sor.arrange(s);
	}
	@GET
	@Path("/middleone/{s}")
	public String middleOneTwo(@PathParam("s")String s) {
		MiddleOne mo = new MiddleOne();
		return mo.fetch(s);
	}
	@GET
	@Path("/check")
	public String checkDisplay() {
		CheckSub cs = new CheckSub();
		return cs.display();
	}
	
	@GET
	@Path("/checkclass")
	public String checkClsDisp() {
		CheckSub cs = new CheckSub();
		return cs.areaOfCircle();
		//return cs.display();
	}
	
	@GET
	@Path("/abstract")
	public String abstractDisp() {
		AbstractSub2 ab = new AbstractSub2();
		return ab.method1()+" "+ab.method2();
		//return cs.display();
	}
	
	@GET
	@Path("/func/{x}")
	public String lamdaDisp(@PathParam("x")int x) {
		Lamda l = (i)->{
			return "Cube is "+(i*i*i);
		};
		String cube = l.func(x);
		return cube+"";
		
		
	}
	@GET
	@Path("vote/{x}")
	public String getVote(@PathParam("x") int i) {
		Vote v = new Vote();
		v.age = i;
		return v.giveVote(i);
	}
	
	@GET
	@Path("checking")
	public String getcheck() {
		CheckSub2 v = new CheckSub2();
		 
		return v.checking();
	}
	
	@GET
	@Path("outerinner")
	public String outerInner() {
		Outer out = new Outer();
	//	Outer.Inner in = out.new Inner();        for non static variable in inner cls
		Outer.Inner in = new Outer.Inner();      //for static variable in inner cls
		return out.x+"<br>"+in.y+"<br>"+out.getmsg();
	}
	@GET
	@Path("compare/{a},{b}")
	public String compare(@PathParam("a")int a,@PathParam("b")int b) {
		
		Lamda1 l = (x,y)->{
			if(x>y) {
				return "True : First value is Bigger";
			}
			else {
				return "False";
			}
		};
		Lamda1 s = (x,y)->{
			if(x<y) {
				return "True : First value is Smaller";
			}
			else {
				return "False";
			}
		};
		Lamda1 sam = (x,y)->{
			if(x==y) {
				return "True : Both are Equal";
			}
			else {
				return "False";
			}
		};
		
		String big = l.funct(a, b);
		String small = s.funct(a, b);
		String same = sam.funct(a, b);
		
		return big+"<br>"+small+"<br>"+same;
		
	}
	@GET
	@Path("concheck")
	public String check() {
		ConCheck c = ConCheck.createObj();
		return c.disp()+"<br>"+c.a;
	}
	
	@GET
	@Path("innercheck")
	public String innercheck() {
		CheckInner ci = new CheckInner();
		
		return ci.inner();
	}
	
	@GET
	@Path("arrayyy/{n},{x}")
	public String arr(@PathParam("n")int a,@PathParam("x")int x) {
		Array array = new Array();
		
		array.createArray(a);
		array.addValue(x);
		return array.readArray();
	}
	
	@GET
	@Path("bonus")
	public String empDisp() {
		
		int ids[] = {101,102,103,104};
		String names[] = {"Sai","Susmitha","Daniel","Smith"};
		//double salarys[] = {10000,20000,15000,12000};
		//double bonuses[];
		//double tot[];
		int skills[] = {2,3,4,5};
		int exps[] = {5,2,1,3};
		
	
		Employe emp[] = new Employe[4];
		for(int i=0;i < emp.length;i++) 
		{
			
			emp[i] = new Employe(ids[i], names[i],skills[i],exps[i]);
			 //emp[i]. bonus = 0.15*emp[i].salary;
			//emp[i]. total = emp[i].bonus+emp[i].salary;
			emp[i].salary = emp[i].skill*1000+emp[i].exp*10000;
		}
			
		
		String res="";
		for(Employe e:emp)
			res+=e.toString()+"<br>";
		return res;
	}
	
	@GET
	@Path("mail/{s}")
	public String mailerror(@PathParam("s")String s) {
		Wednesday w = new Wednesday();
		
		return w.samp(s);
		
	}
	@GET
	@Path("convert")
	public String convertt() {
		
		Asciii as = new Asciii();
		//return as.a+" "+as.b+" "+as.c;
		return as.r+"";
	}
	@GET
	@Path("office/{room}")
	public String getOffice(@PathParam("room") String room) {
		
		//Office learn = Office.TRAINING_ROOM;
		Office ofcs[] = Office.values();
		
		//learn.chairs = 20;
		try {
		Office ofc  = Office.valueOf(room.toUpperCase());
		
		String resp = "";
		switch(ofc) {
		
		case TRAINING_ROOM:
			resp = "Train Yourself";
			break;
		case PANTRY:
			resp = "Don't Waste Food";
			break;
		case CONFERENCE_ROOM:
			resp = "Meetings are Important";
			break;
		case MANAGER_ROOM:
			resp = "Enter Only When Celebrations Happen";
		}
		
		return Arrays.toString(ofcs)+"<br>"+"action : "+resp;
		
	}
		catch(IllegalArgumentException e){
			return "No such room found";
		}
		
	}	
	@GET
	@Path("arith/{op}/{x},{y}")
	public String getvalue(@PathParam("op")String op,@PathParam("x")double x,@PathParam("y")double y) {
		
		
		ArithOpera aop  = ArithOpera.valueOf(op.toUpperCase());
		
		String res = "";
		switch(aop) {
		
		case ADDITION:
			res = "Addition of two numbers is : "+(x+y);
			break;
		case SUBSTRACTION:
			res = "Substraction of two numbers is : "+(x-y);
			break;
		case MULTIPLICATION:
			res = "Multiplication of two numbers is : "+(x*y);
			break;
		case DIVISION:
			res = "Division of two numbers is : "+(x/y);
		}
		return res;
		
	}
	
	@GET
	@Path("generic")
	public String genTypes() {
		Generic<Integer,String> ig = new Generic<>();
		ig.assign(55, "Sai");
		
		return ig.readT1()+"<br>"+ig.readT2();
	}
	@GET
	@Path("filehandling/{name}")
	public String getFile (@PathParam("name")String fileName) throws Exception {
		FileOp f = new FileOp();
		return f.loadData(fileName);
	}
	@GET
	@Path("read_data/{name}")
	public String readFile (@PathParam("name")String fileName) throws Exception {
		FileOp f = new FileOp();
		return f.readData(fileName);
	}
	@GET
	@Path("adddata/{a},{b}")
	public String outFile (@PathParam("a")int a,@PathParam("b")int b) throws Exception {
		FileAdd f = new FileAdd();
		return f.add(a, b);
	}
	@GET
	@Path("copy")
	public String inFile () throws Exception {
		FileCopy f = new FileCopy();
		return f.copyfiles();
	}
	@GET
	@Path("compress")
	public String compress () throws Exception {
		FileOp f = new FileOp();
		return f.compress();
	}
	@GET
	@Path("decompress")
	public String decompress () throws Exception {
		FileOp f = new FileOp();
		return f.decompress();
	}
	@GET
	@Path("decompressdurga")
	public String decompressdurga () throws Exception {
		FileOp f = new FileOp();
		return f.decompressDurga();
	}
	@GET
	@Path("decompressteja")
	public String decompressteja () throws Exception {
		FileOp f = new FileOp();
		return f.decompressTeja();
	}
	@GET
	@Path("decompresslav")
	public String decompresslav () throws Exception {
		FileOp f = new FileOp();
		return f.decompressLav();
	}
	@GET
	@Path("obj_file")
	public String objfile() throws Exception {
		Studnt ss = new Studnt();
		return ss.objToFile();
	}
	@GET
	@Path("file_obj")
	public String fileobj() throws Exception {
		Studnt ss = new Studnt();
		return ss.fileToObj();
	}
	@GET
	@Path("printingline")
	public String getline () throws Exception {
		FileOp f = new FileOp();
		return f.printLine();
	}
	@GET
	@Path("read_line/{n}")
	public String readLine (@PathParam("n")int n) throws Exception {
		FileOp f = new FileOp();
		return f.readline(n);
	}
	@GET
	@Path("read_elt/{elt}")
	public String readLine (@PathParam("elt")String elt) throws Exception {
		FileOp f = new FileOp();
		return f.variables(elt);
	}
	@GET
	@Path("read_array")
	public String readLine () throws Exception {
		FileOp f = new FileOp();
		return f.arrayFile();
	}
	@GET
	@Path("read_ind/{ind}")
	public String readIndex (@PathParam("ind")int ind) throws Exception {
		FileOp f = new FileOp();
		return f.printIndex(ind);
	}
	@GET
	@Path("rename/{f1},{f2}")
	public String renameFile (@PathParam("f1")String f1name,@PathParam("f2")String f2name) {
		FileOp f = new FileOp();
		return f.rename(f1name, f2name);
	}
	@GET
	@Path("copyfile")
	public String copy () throws Exception {
		FileOp f = new FileOp();
		return f.copyFile();
	}
	@GET
	@Path("cutfile")
	public String cut () throws Exception {
		FileOp f = new FileOp();
		return f.cutFile();
	}
}