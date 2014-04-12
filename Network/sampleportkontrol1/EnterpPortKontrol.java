package sampleportkontrol1;
public class EnterpPortKontrol {

	public static void main(String[] args) {

		int portSayisi = 4000;

		for (int i = 1; i <= portSayisi; i++) {
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
			}
			new EPLThreadPart("www.google.com", i).start();
		}

	}

}