
public class StringComparator implements Comparable<String> {

	
	public int compareTo(String a,String b) {
		return a.toUpperCase().compareTo(b.toUpperCase());
	}

	@Override
	public int compareTo(String o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
