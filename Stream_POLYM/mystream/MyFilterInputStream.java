package mystream;

import java.io.IOException;
import java.io.InputStream;

public class MyFilterInputStream {
	protected InputStream in;
	 
	public MyFilterInputStream(InputStream in) {
		this.in = in;
	}

	public int read() throws IOException {
		// TODO Auto-generated method stub
		return in.read();
	}

}
