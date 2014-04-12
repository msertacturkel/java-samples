package hashset;

import java.awt.Color;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;



public class HashSetTest {

	public static void main(String[] args) {
		
		HashSet h=new HashSet();
		h.add("merhaba");
		Date d=new Date();
		h.add(d);
		h.add(Color.blue);
		h.add("nasilsin");
		String str="merhaba";
		h.add(str);		
		
		Iterator iter = h.iterator();
		while(iter.hasNext())
			System.out.println(iter.next());
	

	}

}