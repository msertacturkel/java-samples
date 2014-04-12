package cars;

public class OtomobilKotuTest {

	public static void main(String[] args) {
		/*
		 * Otomobil oto; oto=new Otomobil();
		 */

		// Otomobil oto=new Otomobil("audi","A1","kirmizi",1000,1400,2011);
		OtomobilKotu oto = new OtomobilKotu();
		oto.marka = "audi";
		oto.model = "A1";
		oto.renk = "kirmizi";
		oto.agirlik = 1000;
		oto.motorHacmi = 1400;
		oto.uretimYili = 2011;

		oto.klimaCalistir(false);
		oto.info();

		OtomobilKotu oto1 = new OtomobilKotu();
		oto1.marka = "Tofas";
		oto1.model = "Sahin";
		oto1.renk = "Beyaz";
		oto1.motorHacmi = 1600;
		oto1.agirlik = 1000;
		oto1.uretimYili = 1990;

		oto1.klimaCalistir(true);
		oto1.info();

	}

}
