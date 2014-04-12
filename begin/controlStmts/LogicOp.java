package controlStmts;

public class LogicOp {

	public static void main(String[] args) {
		int a = 3, b = 5, c = 2;

		// int toplam=(a>b)+(c<3);
		System.out.println("++b = " + ++b);
		System.out.println("++b > 6 "+ (++b >6));

		if ((a < b) || (++b > c)) {
			System.out.println("I am in");
		}
		System.out.println(b);
	}
}
