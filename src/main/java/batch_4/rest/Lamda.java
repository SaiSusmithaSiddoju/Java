package batch_4.rest;

@FunctionalInterface
public interface Lamda {
	
	public String func(int x);
	
	default String some() {
		return "Hai";
	}
	
	static String nthng() {
		return "Bye";                            //we cannot have static default at once
	}

}
