import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;


public class ListTest {

	public static void main(String[] args) {
		CD cd1 = new CD(1, "the beatles", "1");
		CD cd2 = new CD(2, "a", "a");
		CD cd3 = new CD(3, "tb", "b");
		CD cd4 = new CD(4, "s", "c");
		
		List<CD> cdCollection=new ArrayList();
		cdCollection.add(cd1);
		cdCollection.add(cd2);
		cdCollection.add(cd3);
		cdCollection.add(0,cd4);
		for (int i = 0; i < cdCollection.size(); i++) {
			cdCollection.get(i);
		}
		for (CD cd : cdCollection) {
			System.out.println(cd);
		}
		Iterator<CD> it=cdCollection.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}

	}

}
