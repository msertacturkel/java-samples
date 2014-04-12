package example;

public class DikdortgenTest {

	public static void main(String[] args) {
		Dikdortgen d = new Dikdortgen(3.0, 4.0);// genislik x yukseklik

		double alan = d.alan();
		double cevre = d.cevre();
		System.out.println("alan:" + alan);
		System.out.println("cevre:" + cevre);
		double boyutlar[] = d.getBoyutlar();
		System.out.println("Genislik:" + boyutlar[0]);
		System.out.println("Yukseklik:" + boyutlar[1]);
	}

}
