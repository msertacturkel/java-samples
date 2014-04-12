package sampleportkontrol2;

import sampleportkontrol1.EPLThreadPart;

public class EnterprisePortKontol1 {

	public static void main(String[] args) {

		int portSayisi = 4000;

		for (int i = 1; i <= portSayisi; i++) {

			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
			}

			Thread th = new Thread(new EPLThreadPart("www.google.com", i));
			th.start();
		}

	}

}