package boyut;

public class Boyut8Test {

	public static void main(String[] args) {
		Daire da = new Daire(3);
		Dikdortgen di = new Dikdortgen(2, 1);
		Elma e = new Elma();
		try {
			Boyut8 b2 = new Boyut8(di);
			Boyut8 b1 = new Boyut8(da);
			Boyut8 b3 = new Boyut8(e);

			double daireAlan3k = b1.alan3k();
			double dikdortgenAlan3k = b2.alan3k();
			System.out.println(daireAlan3k);
			System.out.println(dikdortgenAlan3k);
			double elmaAlan3k = b3.alan3k();
		} catch (AlaniHesaplanamayanSinifHatasi e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
