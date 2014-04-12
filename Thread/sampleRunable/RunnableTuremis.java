
public class RunnableTuremis implements Runnable {

	private String mesaj;	
	
	public RunnableTuremis(String mesaj) {
		this.mesaj = mesaj;
	}

	public void run() {
		while(true)
			System.out.println(mesaj);

	}

}
