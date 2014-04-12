package boyut;

public class Boyut2 {
	private Daire da;
	private Dikdortgen di;

	public Boyut2(Daire da) {
		this.da = da;
	}

	public Boyut2(Dikdortgen di) {
		this.di = di;
	}

	public double alan3k() {
		if (da != null)
			return 3 * da.alan();
		else
			return 3 * di.alan();
	}
}
