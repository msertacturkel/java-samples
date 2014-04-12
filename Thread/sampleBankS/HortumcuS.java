
public class HortumcuS extends Thread {

	private HesapS hesap;
	
	
	public HortumcuS(HesapS hesap) {
		this.hesap = hesap;
	}


	public void run() {
		while(true)
			hesap.paraCek(1);
	}
}
