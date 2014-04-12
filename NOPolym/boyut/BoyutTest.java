package boyut;

public class BoyutTest {
	public static void main(String[] args) {
		Boyut b = new Boyut();
		Daire da = new Daire(10);
		Dikdortgen di = new Dikdortgen(3, 5);
		double daireAlan3k = b.alan3k(da);
		double dikdortgenAlan3k = b.alan3k(di);
		System.out.println(daireAlan3k);
		System.out.println(dikdortgenAlan3k);
	}
}