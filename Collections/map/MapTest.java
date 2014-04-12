package map;

import java.awt.Color;
import java.util.TreeMap;

public class MapTest {

	public static void main(String[] args) {
		TreeMap<String, Color> t = new TreeMap<String, Color>();
		t.put("kirmizi", Color.red);
		t.put("beyaz", Color.white);
		
		System.out.println(t.get("beyaz"));
	}

}