package batch_4.rest;

public class Generic<T1,T2> {
	
	T1 x;
	T2 s;
	
	public void assign(T1 x,T2 s) {
		this.x= x;
		this.s = s;
	}
	
	public T1 readT1() {
		return x;
	}
	
	public T2 readT2() {
		return s;
	}
	
}
