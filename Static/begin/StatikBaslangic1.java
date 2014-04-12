package begin;

public class StatikBaslangic1 {

	
	private int j1=fonk3();
	private int j2=fonk4();
	
	private static int i2 = fonk2();
	private static int i1 = fonk1();
	
	
	public StatikBaslangic1() {
		System.out.println("constr..");
	}
	private int fonk4() {
		System.out.println("fonk4 j");
		return 2;
	}
	private int fonk3() {
		System.out.println("fonk3 j");
		return 1;
	}
	private static int fonk1() {
		System.out.println("fonk1 i");
		return 3;
	}

	private static int fonk2() {
		System.out.println("fonk2 i");
		return 5;
	}
}