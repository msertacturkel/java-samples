package cars;

public class OtomobilKotu {
	// property(OOP) sinif degiskeni (Java) veri elemani(C++)
	String renk, marka, model;
	int agirlik, motorHacmi, uretimYili;

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
	}
}
