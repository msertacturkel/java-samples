package cars;

public class Lastik {
	String marka, tip;
	int cap;

	Lastik(String mrk, String tp, int cp) {
		marka = mrk;
		tip = tp;
		cap = cp;
	}

	void info() {
		System.out.println("Marka:" + marka);
		System.out.println("Tip:" + tip);
		System.out.println("Cap:" + cap);
	}
}
