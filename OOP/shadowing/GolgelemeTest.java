package shadowing;

public class GolgelemeTest {

	public static void main(String[] args) {
		Golgeleme g=new Golgeleme();
		GolgelemeTaban gt=(GolgelemeTaban)g;
		GolgelemeTabanTaban gtt=(GolgelemeTaban)g;
	    g.fonk(4);
		/*System.out.println(g.i);
		System.out.println(gt.i);
		System.out.println(gtt.i);*/
	}

}
