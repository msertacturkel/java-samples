package arraylist;

import java.awt.List;
import java.util.*;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<String> v = new ArrayList<String>();
		v.add("merhaba");
		v.add("Burak");
		v.add("deneme");
		v.add("merhaba");

		/*for (int i = 0; i < v.size(); i++)
			System.out.println(v.get(i));
		*/
		
		for (String str : v) {
			System.out.println(str);
		}

	}

}