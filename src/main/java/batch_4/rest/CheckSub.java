package batch_4.rest;


public class CheckSub extends CheckClass{

	int r = 5;
	final double pi = 3.14;
	
	CheckClass cs = new CheckClass();
	
	public String display() {
		
		return cs.i+" "+i+"";
		
	}
	public String areaOfCircle() {
		double aoc = (pi*r*r);
		return aoc+"";
	}
}
