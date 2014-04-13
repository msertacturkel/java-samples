package euler;

public class p3 {
	public static void main(String[] args) {
		long sayi = 6008514;
		
		for (int i = 2; i < sayi; i++) {
			if (sayi%i==0) {
				if(asal(i))
					System.out.println(i);
				else continue;
			}
			
		}

	}

	public static boolean asal(int x) {
		for (int i = 2; i < x; i++) {
			if (x % i == 0)
				return false;
		}
		return true;

	}
}
