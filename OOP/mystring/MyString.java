package mystring;

public class MyString {
	// method overloading
	public int indexOf(char ch) {
		System.out.println("char");
		return 0;
	}

	public int indexOf(String s) {
		System.out.println("String");
		return 0;
	}

	public int indexOf(char ch, int startPos) {
		System.out.println("char,int");
		return 0;
	}

	public int indexOf(String str, int startPos) {
		return 0;
	}
}
