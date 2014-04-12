package example;

public class Daire {
	double r;

	Daire(double y) {
		r = y;
	}

	double alan() {
		return Math.PI * r * r;
	}

	double cevre() {
		return 2 * Math.PI * r;
	}
}
