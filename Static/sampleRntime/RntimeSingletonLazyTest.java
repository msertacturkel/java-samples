package sampleRntime;

public class RntimeSingletonLazyTest {

	public static void main(String[] args) {
		RntimeSingletonLazy rn1 = RntimeSingletonLazy.getRntime();
		RntimeSingletonLazy rn2 = RntimeSingletonLazy.getRntime();
		RntimeSingletonLazy rn3 = RntimeSingletonLazy.getRntime();
		RntimeSingletonLazy rn4 = RntimeSingletonLazy.getRntime();
		System.out.println(rn1);
		System.out.println(rn2);
		System.out.println(rn3);
		System.out.println(rn4);
		System.out.println(rn1.freeMemory());
		System.out.println(rn2.freeMemory());
		System.out.println(rn3.freeMemory());

	}

}