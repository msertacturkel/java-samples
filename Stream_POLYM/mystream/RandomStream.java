package mystream;
import java.io.IOException;
import java.io.InputStream;

public class RandomStream extends InputStream {

	public int read() throws IOException {
		int i = (int) (Math.random() * 28);
		if (i == 26)
			return '\n';
		if (i == 27)
			return -1;
		char c = (char) ('A' + i);
		return c;
	}
}