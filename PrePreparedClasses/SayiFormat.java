import java.text.NumberFormat;
import java.util.Locale;


public class SayiFormat {

	public static void main(String[] args) {
		double d=12345.6823518261;
		NumberFormat nf1=NumberFormat.getNumberInstance();
		NumberFormat nf2=NumberFormat.getNumberInstance(new Locale("tr"));
		System.out.println(nf1.format(d));
		System.out.println(nf2.format(d));
	}

}
