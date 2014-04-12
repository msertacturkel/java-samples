package bitwiseOp;

public class BitOp {

	public static void main(String[] args) {
		int a=12,b=7,c=-12;
		System.out.println(a + "&" + b + "=" + (a & b));
		System.out.println(a + "|" + b + "=" + (a | b));
		System.out.println(a + "^" + b + "=" + (a ^ b));
		System.out.println(a + ">>" + 1 + "=" + (a >> 1));
		System.out.println(a + "<<" + 1 + "=" + (a << 1));
		System.out.println(a + ">>>" + 1 + "=" + (a >>> 1));
		System.out.println(c + ">>>" + 1 + "=" + (c >>> 1));
	}

}
