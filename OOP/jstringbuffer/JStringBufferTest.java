package jstringbuffer;

public class JStringBufferTest {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("deneme");
		JStringBuffer jsb = new JStringBuffer("deneme");
		int cap = sb.capacity();
		int jcap = jsb.capacity();
		System.out.println(cap);
		System.out.println(jcap);
		System.out.println(sb + "sertac");
		System.out.println(jsb + "sertac");
		System.out.println(sb.length());
		System.out.println(jsb.length());
		/*
		 * sb=sb.append('k'); jsb.append('k'); System.out.println(sb);
		 * System.out.println(jsb); sb.append('k'); jsb.append('k');
		 * System.out.println(sb); System.out.println(jsb);
		 */
		/*
		 * sb.append("dunyabbbbbbbbbbbbbbbb");
		 * jsb.append("dunyabbbbbbbbbbbbbb"); System.out.println(sb.capacity());
		 * System.out.println(jsb.capacity());
		 * 
		 * System.out.println(sb); System.out.println(jsb);
		 */

		/*
		 * sb.insert(2, 'z'); jsb.insert(2, 'z'); System.out.println(sb);
		 * System.out.println(jsb);
		 */
		sb.delete(2, 4);
		jsb.delete(2, 4);
		System.out.println(sb);
		System.out.println(jsb);

	}

}
