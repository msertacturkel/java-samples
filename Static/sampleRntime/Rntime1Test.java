package sampleRntime;

public class Rntime1Test {

	public static void main(String[] args) {
	    Rntime1 rn1=Rntime1.getRntime();
	    Rntime1 rn2=Rntime1.getRntime();
	    Rntime1 rn3=Rntime1.getRntime();
	    Rntime1 rn4=Rntime1.getRntime();
	    System.out.println(rn1.freeMemory());
	    System.out.println(rn2.freeMemory());
	    System.out.println(rn3.freeMemory());

	}

}