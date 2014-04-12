package samplesistem;

import java.io.PrintStream;

public class SistemCokKotu {

	private SistemCokKotu() {
	}

	//Her defasinda yeni bir PrintStream nesnesi olusuyor
	public static PrintStream out() {
		// TODO Auto-generated method stub
		return new PrintStream(System.out);
	}

}