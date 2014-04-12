package vektor;

import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		v.add("merhaba");
		v.add("Burak");
		v.add("deneme");
		v.add("merhaba");

		for (int i = 0; i < v.size(); i++)
			System.out.println(v.elementAt(i));

	}

}