import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		CD cd1 = new CD(1, "the beatles", "1");
		CD cd2 = new CD(2, "a", "a");
		CD cd3 = new CD(3, "tb", "b");
		CD cd4 = new CD(4, "s", "c");
		Map<String, CD> mymap = new HashMap();
		mymap.put("1", cd1);
		mymap.put("2", cd2);
		mymap.put("3", cd3);
		mymap.put("4", cd4);
		Set<String> keys=mymap.keySet();
		Iterator<String> it=keys.iterator();
		while(it.hasNext()){
			String key=it.next();
			System.out.println("key-->"+key);
			System.out.println("value-->"+mymap.get(it.next()));
		}
	}

}
