package batch_4.rest;

public class Employe {
	
	int id;
	String name;
	double salary;
	//double bonus;
	int skill;
	int exp;
	//double total;
	
	public Employe(int id, String name,int skill,int exp) {
		super();
		this.id = id;
		this.name = name;
		//this.salary = salary;
		this.skill = skill;
		this.exp = exp;
			}
	public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}
	//double bonus = 0.15*salary;
	//double total = bonus+salary;
	
	@Override
	public String toString() {
		//return "Employe [id=" + id + ", name=" + name + ", salary=" + salary + ", bonus=" + bonus + ", total=" + total+"]";
		return "Employe [id=" + id + ", name=" + name + ", skill=" + skill + ", experience = " + exp + ", salary=" + salary + "]";
	}
}
