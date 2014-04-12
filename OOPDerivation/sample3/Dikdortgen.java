package sample3;

public class Dikdortgen{

	double genislik, yukseklik;

	/**
	 * genislik x yukseklik boyutunda Dikdortgen tanimlaniyor
	 * 
	 * @param gen
	 * @param yuk
	 */
	public Dikdortgen(double gen, double yuk) {

		genislik = gen;
		yukseklik = yuk;
	}

	public double getGenislik() {
		return genislik;
	}

	public void setGenislik(double genislik) {
		this.genislik = genislik;
	}

	public double getYukseklik() {
		return yukseklik;
	}

	public void setYukseklik(double yukseklik) {
		this.yukseklik = yukseklik;
	}

	/**
	 * dikdortgenin alanini hesaplar
	 * 
	 * @return
	 */
	public double alan() {

		return genislik * yukseklik;
	}

	/**
	 * dikdortgenin <font color="red" face="arial"
	 * size="4"><b>cevresini</b></font> hesaplar
	 * 
	 * @return
	 */
	public double cevre() {

		return 2 * (genislik + yukseklik);
	}

	public double[] getBoyutlar() {
		// System.out.println("Genislik:"+boyutlar[0]);
		// System.out.println("Yukseklik:"+boyutlar[1]);
		/*
		 * double[] temp=new double[2]; temp[0]=genislik; temp[1]=yukseklik;
		 */
		double temp[] = { genislik, yukseklik };
		return temp;
	}

}
