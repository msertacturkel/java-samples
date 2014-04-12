import java.util.StringTokenizer;


public class StringTokenizerTest {

	public static void main(String[] args) {
		StringTokenizer st=new StringTokenizer("java,ogreni,yorum,cok,mutluyum",",");
		while(st.hasMoreTokens())
			System.out.println(st.nextToken());

	}

}
