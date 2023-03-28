package batch_4.rest;

public enum Office {
	
	TRAINING_ROOM(20,"training"),PANTRY(10,"food"),CONFERENCE_ROOM(15,"meeting"),MANAGER_ROOM(3,"celebration");
	
	int chairs;
	String action;
	 Office(int chairs, String action) {
		this.chairs = chairs;
		this.action = action;
	}

	
}
