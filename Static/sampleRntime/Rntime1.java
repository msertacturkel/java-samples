package sampleRntime;

public class Rntime1 {

	private static int i = 0;

	private Rntime1() {
	}

	public static Rntime1 getRntime() {
		if (i++ < 2) {
			return new Rntime1();
		}
		return null;
	}

	public int freeMemory() {
		return 5;
	}
}