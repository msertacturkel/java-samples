package mystream;

import java.io.IOException;
import java.io.InputStream;

public class MyStream extends InputStream {

	private char dizi[] = { 'M', 'e', 'r', 'h','\n', 'h', 'a', '\n', 'b', 'a' };
	private int i;

	public int read() throws IOException {

		if (i < dizi.length)
			return dizi[i++];
		return -1;
	}

}
