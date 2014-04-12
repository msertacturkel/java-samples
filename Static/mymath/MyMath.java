package mymath;

public class MyMath {

	public static final double PI=3.1415926535897932384626;                     
	
	
	/* don't let anyone instantiate this class */
	private MyMath() {
	}
	
	public static double sqrt(double d){
		return Math.sqrt(d);
	}
	
	public static double sin(double d){
		return Math.sin(d);
	}
}