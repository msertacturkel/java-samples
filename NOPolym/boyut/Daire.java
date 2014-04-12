package boyut;

public class Daire {
	private double r;

	public Daire(double r) {
		this.r=r;
	}

	public double alan() {
		return Math.PI * r * r;
	}

	public double cevre() {
		return 2 * Math.PI * r;
	}
}
