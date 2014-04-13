package euler;

public class p4 {
	private static int k;
	public static void main(String[] args) {
		String n;
		k = 0;
		for (int i = 100; i < 999; i++) {
			for (int j = 100; j < 999; j++) {
			k=i*j;	
			n=""+k;
			if (n.equals(reverseIt(n))) {
				System.out.println(n);
				}
			}
			
		}
			
	}
	public static String reverseIt(String a) {
	    int i, len = a.length();
	    StringBuffer dest = new StringBuffer(len);

	    for (i = (len - 1); i >= 0; i--)
	      dest.append(a.charAt(i));
	    return dest.toString();
	  }

}
