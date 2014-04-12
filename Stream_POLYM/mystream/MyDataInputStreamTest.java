package mystream;

import java.io.DataInputStream;
import java.io.IOException;

import fileop.MyDataInputStream;


public class MyDataInputStreamTest {

	public static void main(String[] args) {

		DataInputStream ds = new DataInputStream(new MyURL().openStream());
		MyDataInputStream mds = new MyDataInputStream(new MyStream());

		try {
			/*
			 * byte b1 = ds.readByte(); byte mb1 = mds.readByte();
			 * 
			 * System.out.println(b1); System.out.println(mb1);
			 */
			int i1 = ds.readInt();
			int i2 = mds.readInt();
			System.out.println(i1);
			System.out.println(i2);
			char ch1 = (char) ((byte) (i1>>8));
			char ch2 = (char) (i1>>16 & 0xff);
			char ch3 = (char) (i1>>24 & 255);
			System.out.println(ch1);
			System.out.println(ch2);
			System.out.println(ch3);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
