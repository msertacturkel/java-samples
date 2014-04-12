package begin;

public class StatikTest {

	public static void main(String[] args) {

		Statik s1 = new Statik();
		Statik s2 = new Statik();
		Statik s3 = new Statik();

		s1.info();//1
	
		s3.info();//3
		s2.info();//2
		System.out.println(s1.getJ());
		System.out.println(s2.getJ());

	}

}
