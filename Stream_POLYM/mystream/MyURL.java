package mystream;

import java.io.InputStream;


public class MyURL {

	public InputStream openStream(){
		//InputStream'den turemis bir sinif cagiriyor
		return new MyStream();
	}
}