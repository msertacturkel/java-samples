package boyut;

public class Boyut6Test {

	public static void main(String[] args) {
		Daire da = new Daire(3);
		Dikdortgen di = new Dikdortgen(2, 1);
		Elma e = new Elma();

		Boyut6 b1 = new Boyut6(da);
		Boyut6 b2 = new Boyut6(di);
		Boyut6 b3 = new Boyut6(e);

		try {
			double daireAlan3k = b1.alan3k();
			double dikdortgenAlan3k = b2.alan3k();
			double elmaAlan3k = b3.alan3k();
		} catch (AlaniHesaplanamayanSinifHatasi e1) {
			e1.printStackTrace();
		}

	}
}
