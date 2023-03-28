package batch_4.rest;

import javax.ws.rs.Path;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Student {

	public int id;
	public String name;
	public String course;
	public int fee;

	public Student() {
		super();
	}

	public Student(int id, String name, String course, int fee) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
		this.fee = fee;
	}

}
