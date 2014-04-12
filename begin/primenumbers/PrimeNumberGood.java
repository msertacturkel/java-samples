package primenumbers;

public class PrimeNumberGood {

	public static void main(String[] args) {
		int n = 1000000;
		loop: for (int i = 2; i <= n; i++) {
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0)
					continue loop;
			}
			System.out.println(i);
		}// loop
	}
}
