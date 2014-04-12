package cars;

public class OtomobilTest {

	public static void main(String[] args) {
		Otomobil oto = new Otomobil("audi", "A1", "kirmizi", 1000, 1400, 2011);
		Otomobil oto1 = new Otomobil("Tofas", "Sahin", "beyaz", 1000, 1600,
				1990);
		oto.klimaCalistir(false);
		oto.info();
		oto1.klimaCalistir(false);
		oto1.info();
		System.out.println(oto);
	}

}
