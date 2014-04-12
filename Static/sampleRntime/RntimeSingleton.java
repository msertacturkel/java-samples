package sampleRntime;

public class RntimeSingleton {

	private static int i = 0;
	private static RntimeSingleton rn2;

	private RntimeSingleton() {
	}

	public static RntimeSingleton getRntime() {
		if (i++ < 1) {
			rn2= new RntimeSingleton();
		}
		return rn2;
	}

	public int freeMemory() {
		return 5;
	}
}