public class HesapS {

	private int bakiye;

	// Baslangic parasi yatiriliyor
	public HesapS(int bakiye) {
		this.bakiye = bakiye;
	}

	public synchronized void paraCek(int miktar) {
		bakiye -= miktar;
		notify();// uyuyani uyandir
		try {
			wait();// uyu
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	public synchronized void paraYatir(int miktar) {
		bakiye += miktar;
		notify();// uyuyani uyandir
		try {
			wait();// uyu
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	public int info() {
		return bakiye;
	}
}
