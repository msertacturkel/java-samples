package cars;

public class OtomobilLTest {

	public static void main(String[] args) {
		Lastik karGood=new Lastik("Goodyear", "kar", 17);
		OtomobilL oto = new OtomobilL("audi", "A1", "kirmizi", 1000, 1400, 2011,karGood);
		oto.klimaCalistir(true);
		oto.info();
	}

}
