package tree;

public class Agac {

	String cins;
	double yukseklik;

	// sinif degiskenleri referans tipten ise default olarak null degerini,
	// boolean ise false,
	// sayi tipinde ise 0 degerini alir
	// ancak kod okunabilirligi acisinda biz constr icine atamalari
	// acikca yapacagiz.
	public Agac() {
		cins = null;
		yukseklik = 0;
	}

	public Agac(String cns) {
		cins = cns;
		yukseklik = 0;
	}

	public Agac(double yuk) {
		cins = null;
		yukseklik = yuk;
	}

	public Agac(String cns, double yuk) {
		cins = cns;
		yukseklik = yuk;
	}

	public Agac(double yuk, String cns) {
		// new Agac(cns,yuk);
		this(cns, yuk);
		// this(yuk);
	}

	public void info() {
		if ((yukseklik == 0) && (cins == null))
			System.out.println("Herhangi bir agac");
		else if (yukseklik == 0)
			System.out.println(cins + "  agaci");
		else if (cins == null)
			System.out.println(yukseklik + " m. yuksekliginde bir agac");
		else
			System.out.println(yukseklik + " m yuksekliginde bir " + cins
					+ " agaci");
	}

}
