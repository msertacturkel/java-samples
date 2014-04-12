package sampleRntime;

public class Rntime {

	private Rntime() {
	}

	public static Rntime getRntime() {		
		
		return new Rntime();
	}

	public int freeMemory() {
		return 5;
	}
}