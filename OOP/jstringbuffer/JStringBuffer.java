package jstringbuffer;

public class JStringBuffer {
	private int count;
	private char value[];

	public JStringBuffer(int capacity) {
		value = new char[capacity];
	}

	public JStringBuffer() {
		this(16);
	}

	public JStringBuffer(String str) {
		char[] dizi = str.toCharArray();
		count = dizi.length;
		value = new char[count + 16];
		System.arraycopy(dizi, 0, value, 0, count);
	}

	public int capacity() {

		return value.length;
	}

	public String toString() {

		return String.valueOf(value, 0, count);
	}

	public int length() {
		return count;
	}

	/*
	 * public JStringBuffer append(int i){ value[count]=(char)i; count++; return
	 * this; }
	 */

	public JStringBuffer append(char ch) {
		ensureCapacity(1);
		value[count] = ch;
		count++;
		return this;
	}

	public JStringBuffer append(String str) {
		char dizi[] = str.toCharArray();
		int length = dizi.length;
		ensureCapacity(length);
		System.arraycopy(dizi, 0, value, count, length);
		count += length;
		return this;
	}

	private void ensureCapacity(int length) {
		if (count + length > value.length) {
			int yeniUzunluk = value.length * 2 + 2;
			char temp[] = new char[yeniUzunluk];
			System.arraycopy(value, 0, temp, 0, count);
			value = temp;// temp'in adresi value'ya esitlendi. Eski value
							// garbage collector tarafindan silinecek
		}

	}

	public JStringBuffer insert(int ofset, char ch) {
		System.arraycopy(value, ofset, value, ofset + 1, count - ofset);
		count++;
		value[ofset] = ch;

		return this;
	}

	public JStringBuffer delete(int start, int end) {
		if (end > count)
			end = count;
		int length = end - start;
		System.arraycopy(value, end, value, start, length);
		count -= length;
		return this;

	}
}
