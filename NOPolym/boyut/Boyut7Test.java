package boyut;

public class Boyut7Test {

	public static void main(String[] args) {
		Daire da = new Daire(3);
		Dikdortgen di = new Dikdortgen(2, 1);
		Elma e = new Elma();

		Boyut7 b1 = new Boyut7(da);
		Boyut7 b2 = new Boyut7(di);
		Boyut7 b3 = new Boyut7(e);

		double daireAlan3k = b1.alan3k();
		double dikdortgenAlan3k = b2.alan3k();
		System.out.println(daireAlan3k);
		System.out.println(dikdortgenAlan3k);
		double elmaAlan3k = b3.alan3k();
	}

}
