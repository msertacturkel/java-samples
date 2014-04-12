package mystring;

public class MyStringTest {

	public static void main(String[] args) {
		String s = "Merhaba";
		int pos1 = s.indexOf('a');
		int pos2 = s.indexOf("haba");

		System.out.println(pos1);
		System.out.println(pos2);
		MyString my = new MyString();
		my.indexOf('a');
		my.indexOf("deneme");
	}

}
