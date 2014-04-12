package primenumbers;

public class PrimeNumberWorst {

	public static void main(String[] args) {
		int n = 1000000;
		// C sytle
		for (int i = 2; i <= n; i++) {
			boolean b = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					b = false;
					break;
				}// for
				if (b)
					System.out.println(i);
			}

		}
	}

}
