package cars;

public class OtomobilL {
	// property(OOP) sinif degiskeni (Java) veri elemani(C++)
	String renk, marka, model;
	int agirlik, motorHacmi, uretimYili;
	Lastik lastik;

	// Otomobil oto=new Otomobil("audi","A1","kirmizi",1000,1400,2011);

	OtomobilL(String mrk, String mdl, String rnk, int agrl, int motHacmi,
			int uretYil, Lastik ls) {
		// Yerel degisken sinif degiskenine ataniyor
		marka = mrk;
		model = mdl;
		renk = rnk;
		agirlik = agrl;
		motorHacmi = motHacmi;
		uretimYili = uretYil;
		lastik = ls;
	}

	// method(OOP) metod(java) uye fonksiyon(C++)
	void klimaCalistir(boolean durum) {
		if (durum)
			System.out.println("isiniyor");
		else
			System.out.println("soguyor");
	}

	void info() {
		System.out.println("marka:" + marka);
		System.out.println("model:" + model);
		System.out.println("renk:" + renk);
		System.out.println("agirlik:" + agirlik);
		System.out.println("motor hacmi:" + motorHacmi);
		System.out.println("uretim yili:" + uretimYili);
		// Lastik cagriliyor
		lastik.info();
	}
}
