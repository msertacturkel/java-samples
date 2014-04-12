package fileop;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public class MyDataInputStream {

	private InputStream in;

	public MyDataInputStream(InputStream in) {
		this.in = in;

	}

	public byte readByte() throws IOException {
		int ch = in.read();
		if (ch < 0)
			throw new EOFException();
		return (byte) ch;
	}

	public char readChar() throws IOException {
		int ch1 = in.read();
		int ch2 = in.read();
		if ((ch1 | ch2) < 0)
			throw new EOFException();
		return (char) ((ch1 << 8) + (ch2 << 0));
	}

	public int readInt() throws IOException {
		int ch1 = in.read();
		int ch2 = in.read();
		int ch3 = in.read();
		int ch4 = in.read();

		if ((ch1 | ch2 | ch3 | ch4) < 0)
			throw new EOFException();
		return (ch1 << 24) + (ch2 << 16) + (ch3 << 8) + (ch4 << 0);
	}

	public String readLine() throws IOException {
		char buf[] = new char[128];
		int i = 0; // sayac
		int ch;
		loop: while (true) {

			switch (ch = in.read()) {
			case -1:
			case '\n':
				break loop;

			default:
				if (i >= 128)
					break loop;
				buf[i++] = (char) ch;

			}
		}
		if ((i == 0 && ch == -1))
			return null;
		return String.copyValueOf(buf, 0, i);

	}

}
