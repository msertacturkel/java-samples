package boyut;

public class Boyut3Test {

	public static void main(String[] args) {
		Daire da = new Daire(10);
		Dikdortgen di = new Dikdortgen(3, 5);
		Boyut3 b1 = new Boyut3(da);
		Boyut3 b2 = new Boyut3(di);
		double daireAlan3k = b1.alan3k();
		double dikdortgenAlan3k = b2.alan3k();
		System.out.println("Daire:" + daireAlan3k);
		System.out.println("Dikdortgen:" + dikdortgenAlan3k);
	}

}
