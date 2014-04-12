package sampleRntime;

public class Rntime2Test {

	public static void main(String[] args) {
	    Rntime2 rn1=Rntime2.getRntime();
	    Rntime2 rn2=Rntime2.getRntime();
	    Rntime2 rn3=Rntime2.getRntime();
	    Rntime2 rn4=Rntime2.getRntime();
	    System.out.println(rn1);
	    System.out.println(rn2);
	    System.out.println(rn3);
	    System.out.println(rn4);
	    System.out.println(rn1.freeMemory());
	    System.out.println(rn2.freeMemory());
	    System.out.println(rn3.freeMemory());

	}

}