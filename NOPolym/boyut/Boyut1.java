package boyut;

public class Boyut1 {
	private double alan;
	public Boyut1(Daire da) {
		alan=da.alan();
	}

	public Boyut1(Dikdortgen di) {
		alan=di.alan();
	}

	public double alan3k() {		
		return 3*alan;
	}

}
