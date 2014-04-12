package aritmetikOp;

public class FracNumber {

	public static void main(String[] args) {
		float f = 2.14f;// 2.1500000
		double d = 2.15;// 2.1500000000000000
		System.out.println("d first: "+d);
		System.out.println("f:"+f);
	    d = f;
		System.out.println("d last:"+d);
		
		// A floating-point literal is of type float if it is suffixed with an
		// ASCII letter F or f;
		// otherwise its type is double and it can optionally be suffixed with
		// an ASCII letter
		// D or d

		double d3 = 10d / 3;
		System.out.println("10d/3: "+d3);
	}

}
