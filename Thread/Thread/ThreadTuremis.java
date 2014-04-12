
public class ThreadTuremis extends Thread {

	private String mesaj;
	
	public ThreadTuremis(String mesaj) {
		this.mesaj = mesaj;
	}

	public void run() {
		while(true)
			System.out.println(mesaj);
	}
}
