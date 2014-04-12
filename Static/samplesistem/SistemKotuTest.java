package samplesistem;

import java.io.PrintStream;

public class SistemKotuTest {

	public static void main(String[] args) {
		// PrintStream so = System.out;
		// PrintStream s1 = Sistem.out();
		for (int i = 0; i < 5; i++) {
			System.out.println("deneme");
			//System.out.println(System.out);
		}

		for (int i = 0; i < 5; i++) {
			SistemKotu.out().println("deneme");
			//System.out.println(SistemKotu.out());
		}

	}

}