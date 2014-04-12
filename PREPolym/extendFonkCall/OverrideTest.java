package extendFonkCall;

public class OverrideTest {

	public static void main(String[] args) {
		/*
		 * Taban ta=new Taban(); ta.fonk(2); Turemis tu=new Turemis();
		 * tu.fonk(5);
		 */
		//Turemis tu = new Turemis();
		//Taban tau = tu;// upcast
		Taban tau=new Turemis();//upcast
		tau.fonk(3);
	    //tau.birFonk();
	}

}
