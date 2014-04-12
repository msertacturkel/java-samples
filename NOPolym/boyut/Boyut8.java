package boyut;

public class Boyut8 {
	private double alan;

	public Boyut8(Object obj) throws AlaniHesaplanamayanSinifHatasi {
		if (obj instanceof Daire) {
			Daire da = (Daire) obj;
			alan = da.alan();
		}
       else if (obj instanceof Dikdortgen) {
			Dikdortgen di = (Dikdortgen) obj;
			alan = di.alan();
		}
		else
		throw new AlaniHesaplanamayanSinifHatasi("Daire veya Dikdortgen olmali");

	}

	public double alan3k() throws AlaniHesaplanamayanSinifHatasi {
		return 3 * alan;
	}
}
