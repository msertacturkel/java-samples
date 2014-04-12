package samplesistem;

import java.io.PrintStream;

public class Sistem {

	// eager singleton
	public static final PrintStream out=new PrintStream(System.out);

	private Sistem() {
	}

	

}