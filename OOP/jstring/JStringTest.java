package jstring;

public class JStringTest {

	public static void main(String[] args) {
		char c[] = { 'M', 'e', 'r', 'h', '!', 'a', 'b', 'a' };
		String s = new String(c);// c dizisinden String sinifi olustu
		int uzunluk = s.length();
		JString js = new JString(c);// c dizisinden JString sinifi olustu
		int juzunluk = js.length();
		System.out.println("uzunluk:" + uzunluk);
		System.out.println("juzunluk:" + juzunluk);
		// String s2="sjsldsad";//String s2=new String("sjsldsad");
		// Yukaridaki gibi operator overloading sadece String sinifina özgüdür.
		c[1] = 'z';
		char c1 = s.charAt(1);
		char jc1 = js.charAt(1);

		System.out.println(c1);
		System.out.println(jc1);

		int pos = s.indexOf('a');
		int jpos = js.indexOf('a');

		System.out.println(pos);
		System.out.println(jpos);

		int pos1 = s.indexOf('a', 5);
		int jpos1 = js.indexOf('a', 5);

		System.out.println(pos1);
		System.out.println(jpos1);

		char[] dizi = s.toCharArray();
		char[] jdizi = js.toCharArray();
		jdizi[2] = 'z';
		System.out.println(dizi[2]);
		System.out.println(js.charAt(2));

		JString js2 = new JString("deneme");
		System.out.println(js2.indexOf('e'));

		String sup = s.toUpperCase();
		System.out.println(sup);

		JString jsup = js.toUpperCase();
		System.out.println(jsup.toString());

		String sub = s.substring(2);
		System.out.println(sub);

		JString jsub = js.substring(2);
		System.out.println(jsub);
	}

}
