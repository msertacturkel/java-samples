import java.util.Date;

public class DiziKopyaBenchMark {

	public DiziKopyaBenchMark() {

		int dizi1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9,1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int dizi2[] = new int[dizi1.length];
		Date d1 = new Date();
		for (int i = 1; i <= 10000000; i++)
			fonk1(dizi1, dizi2);
		Date d2 = new Date();
		for (int i = 1; i <= 10000000; i++)
			fonk2(dizi1, dizi2);
		Date d3 = new Date();
		System.out.println("array copy:" + (d2.getTime() - d1.getTime()));
		System.out.println("for copy:" + (d3.getTime() - d2.getTime()));
	}

	private void fonk2(int[] dizi1, int[] dizi2) {
		for (int i = 0; i < dizi1.length; i++) {
			dizi2[i] = dizi1[i];
		}
	}

	private void fonk1(int[] dizi1, int[] dizi2) {
		System.arraycopy(dizi1, 0, dizi2, 0, dizi1.length);

	}

	public static void main(String[] args) {

		new DiziKopyaBenchMark();

	}

}
