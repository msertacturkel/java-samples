
public class VatandasS extends Thread {

	private HesapS hesap;

	public VatandasS(HesapS hesap) {
		this.hesap = hesap;
	}
	
	
	public void run() {
		while(true)
			hesap.paraYatir(1);
	}
}
