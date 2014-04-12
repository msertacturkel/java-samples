import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {
	public static void main(String[] args) {
		CD cd1 = new CD(1, "the beatles", "1");
		CD cd2 = new CD(2, "a", "a");
		CD cd3 = new CD(3, "tb", "b");
		CD cd4 = new CD(4, "s", "c");
		
		Set<CD> cdCollection=new HashSet();
		cdCollection.add(cd1);
		cdCollection.add(cd2);
		cdCollection.add(cd3);
		cdCollection.add(cd4);
		Iterator<CD> it=cdCollection.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next().toString());
		}
		
		
		
	}

}
