
public class Vatandas extends Thread {

	private Hesap hesap;

	public Vatandas(Hesap hes) {
		this.hesap = hesap;
	}
	
	
	public void run() {
		while(true)
			hesap.paraYatir(1);
	}
}
