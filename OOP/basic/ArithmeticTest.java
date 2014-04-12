package basic;

import math.Arithmetic;

public class ArithmeticTest {

	public static void main(String[] args) {

		Arithmetic ar = new Arithmetic();
        System.out.println(ar.topla(3, 5));
		// public int topla(int a, int b)
		// protected int cikarma(int a, int b)
		// private int carpma(int a, int b)
		// int bolme(int a, int b)

		/*
		 * public erisim hakkinda her 3 gruptan da erisim vardir.(sinif içinden,
		 * türemis siniftan ve dis siniftan.)
		 * 
		 * protected da ise sinif içinden ve türemis siniftan erisim vardir. Dis
		 * siniftan erisim yoktur. 
		 * 
		 * private da ise sadece sinif içinden erisim  vardir. 
		 * 
		 * Erisim hakki belirtilmemis olma durumunda ne olur . Eger çagiran sinif ile çagrilan sinif
		 * ayni pakette ise public gibi davranis vardir. Erisim hakki protected
		 * belirtilmis olsa bile paket içinde public gibi davranis vardir.
		 * Çagiran sinifla, çagrilan sinif farkli pakette ise private gibi
		 * davranis vardir.
		 */
	}

}
