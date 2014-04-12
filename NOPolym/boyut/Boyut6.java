package boyut;

public class Boyut6 {
	private Object obj;

	public Boyut6(Object obj) {
		this.obj = obj;
	}

	public double alan3k() throws AlaniHesaplanamayanSinifHatasi {
		if (obj instanceof Daire) {
			Daire da = (Daire) obj;
			return 3 * da.alan();
		}
		if (obj instanceof Dikdortgen) {
			Dikdortgen di = (Dikdortgen) obj;
			return 3 * di.alan();
		}

		throw new AlaniHesaplanamayanSinifHatasi("Daire veya Dikdortgen olmali");
	}
}
