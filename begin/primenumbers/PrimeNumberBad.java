package primenumbers;

public class PrimeNumberBad {

	public static void main(String[] args) {
		int n = 100;
		loop: for (int i = 2; i <= n; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0)
					continue loop;
			}
			System.out.println(i);
		}// loop
	}

}
