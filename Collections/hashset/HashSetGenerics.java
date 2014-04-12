package hashset;

import java.awt.Color;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Vector;

public class HashSetGenerics {

	public static void main(String[] args) {
		HashSet<String> h = new HashSet<String>();
		h.add("Ahmet");
		h.add("Mehmet");
		h.add("Baskan");

		/*
		 * Iterator<String> iter = h.iterator(); 
		 *   while(iter.hasNext())
		 *    System.out.println(iter.next());
		 */
				
		for (String str : h) {
			System.out.println(str);
		}
		
	}

}
