package batch_4.rest;

public class Stud {
	
	int id;
	String name;
	String course;
	int fee;
	public Stud(int id, String name, String course, int fee) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
		this.fee = fee;
	}
	public Stud() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Stud [id=" + id + ", name=" + name + ", course=" + course + ", fee=" + fee + "]";
	}
	
	

}
