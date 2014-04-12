package sampleRntime;

public class RntimeSingletonLazy {

	private static RntimeSingletonLazy rn = null;

	private RntimeSingletonLazy() {
	}

	public static RntimeSingletonLazy getRntime() {
		if (rn == null) {
			rn = new RntimeSingletonLazy();
		}
		return rn;
	}

	public int freeMemory() {
		return 5;
	}
}
