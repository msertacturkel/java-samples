import java.util.Date;

public class StringToplaBenchMark {

	public StringToplaBenchMark() {

		String s1 = "merhaba";
		String s2 = "merhaba";
		Date d1 = new Date();
		for (int i = 1; i <= 10000000; i++)
			fonk1(s1, s2);
		Date d2 = new Date();
		for (int i = 1; i <= 10000000; i++)
			fonk2(s1, s2);
		Date d3 = new Date();
		System.out.println("fonk1:" + (d2.getTime() - d1.getTime()));
		System.out.println("fonk2:" + (d3.getTime() - d2.getTime()));
	}

	private String fonk1(String s1, String s2) {
		String str = s1 + s2;
		return str;
	}

	private String fonk2(String s1, String s2) {
		return s1 + s2;
	}

	public static void main(String[] args) {

		new StringToplaBenchMark();

	}

}
