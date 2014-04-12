package cast;

public class Casting {
	public static void main(String[] args) {
		// Genisleme (Widening)
		int i = 1234567890;
		float f = i; // float > int
		int fark = i - (int) f;
		System.out.println("fark: " + fark);

		short s = 123;
		int i1 = s; // int > short
		System.out.println("i1: "+i1);

		// Daralma (Narrowing)
		int i2 = 255;
		byte b2 = (byte) i2; // byte < int
		System.out.println("i2: "+i2);
		System.out.println("b2: "+b2);
	}

}
