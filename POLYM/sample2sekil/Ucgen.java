package sample2sekil;

public class Ucgen extends Sekil {

	private double a,b,c;
	
	
	public Ucgen(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}


	public double alan() {	
		double u=(a+b+c)/2;
		double alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
		return alan;
	}

	
	public double cevre() {
		// TODO Auto-generated method stub
		return a+b+c;
	}

}