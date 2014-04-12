package jstring;

public class JString {
	private int count; // JString'in karakter uzunlugunu tutar
	private char value[];// JString'in karakterlerini tutan dizi

	/**
	 * ch dizisi alarak JString olusur
	 * 
	 * @param ch
	 */
	public JString(char ch[]) {
		count = ch.length;
		// value = ch; //yanlis
		value = new char[count];
		/*
		 * for (int i = 0; i < count; i++) { value[i] = ch[i]; }
		 */
		System.arraycopy(ch, 0, value, 0, count);
	}

	public JString(String str) {
		value = str.toCharArray();
		count = value.length;
	}

	/**
	 * JString'in uzunlugu
	 * 
	 * @return
	 */
	public int length() {
		return count;
	}

	/**
	 * 
	 * verilen indisteki karakteri dondurur
	 */
	public char charAt(int index) {
		return value[index];
	}

	public int indexOf(char ch) {
		return indexOf(ch, 0);
	}

	public int indexOf(char ch, int startingIndex) {
		for (int i = startingIndex; i < count; i++) {
			if (ch == value[i])
				return i;
		}
		return -1;
	}

	public int indexOf(String str) {
		return indexOf(str, 0);
	}

	public int indexOf(String str, int startingIndex) {
		// v ile value karsilastirilacxak
		char[] v = str.toCharArray();
		return 0;
	}

	public char[] toCharArray() {
		// TODO Auto-generated method stub
		char v[] = new char[count];// bos dizi
		System.arraycopy(value, 0, v, 0, count);
		return v;
	}

	public JString toUpperCase() {
		char yeni[] = new char[count];
		for (int i = 0; i < count; i++) {
			char c = value[i];
			if ((c >= 97) && (c <= 122))
				c = (char) (c - 32);
			yeni[i] = c;
		}

		return new JString(yeni);
	}

	/**
	 * String representation of value[]
	 * 
	 * @return
	 */
	public String toString() {
		return new String(value);
	}

	public JString substring(int start) {
		return substring(start, count);
	}

	public JString substring(int start, int end) {
		int length = end - start;
		char temp[] = new char[length];
		System.arraycopy(value, start, temp, 0, length);
		return new JString(temp);
	}
}
