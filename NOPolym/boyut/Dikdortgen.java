package boyut;

public class Dikdortgen {
	private double genislik, yukseklik;

	public Dikdortgen(double gen, double yuk) {
		genislik = gen;
		yukseklik = yuk;
	}

	public double alan() {

		return genislik * yukseklik;
	}

	public double cevre() {

		return 2 * (genislik + yukseklik);
	}
}
