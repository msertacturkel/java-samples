package sampleRntime;

public class RntimeSingletonTest {

	public static void main(String[] args) {
	    RntimeSingleton rn1=RntimeSingleton.getRntime();
	    RntimeSingleton rn2=RntimeSingleton.getRntime();
	    RntimeSingleton rn3=RntimeSingleton.getRntime();
	    RntimeSingleton rn4=RntimeSingleton.getRntime();
	    System.out.println(rn1);
	    System.out.println(rn2);
	    System.out.println(rn3);
	    System.out.println(rn4);
	    System.out.println(rn1.freeMemory());
	    System.out.println(rn2.freeMemory());
	    System.out.println(rn3.freeMemory());

	}

}