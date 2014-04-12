package samplesistem;

import java.io.PrintStream;

public class SistemKotu {

	// lazy singleton
	private static PrintStream pr;

	private SistemKotu() {
	}

	// Her defasinda yeni bir PrintStream nesnesi olusuyor
	public static PrintStream out() {
		if (pr == null)
			pr = new PrintStream(System.out);
		return pr;
	}

}
