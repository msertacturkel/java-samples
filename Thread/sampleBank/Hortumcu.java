
public class Hortumcu extends Thread {

	private Hesap hesap;
	
	
	public Hortumcu(Hesap hesap) {
		this.hesap = hesap;
	}


	public void run() {
		while(true)
			hesap.paraCek(1);
	}
}
