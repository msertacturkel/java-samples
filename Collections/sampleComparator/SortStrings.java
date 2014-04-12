import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;


public class SortStrings {

	public static void main(String[] args) {
		
		//Set<String> students=new TreeSet((NavigableMap) new StringComparator());
		Set<String> students=new TreeSet<>();
		students.add("mustafa");
		students.add("sertac");
		for (String string : students) {
			System.out.println(string);
		}

	}

}
