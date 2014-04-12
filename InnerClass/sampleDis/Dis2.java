public class Dis2 {

	private int iD = 10;

	public void disFonk() {
		Ic ic = new Ic();
		ic.fonkIc();
	}

	private class Ic {
		private void fonkIc() {
			System.out.println("ic fonk.." + iD);
			Ic1 ic1 = new Ic1();
			ic1.fonkIc1();
		}
	}

	private class Ic1 {
		private void fonkIc1() {
			System.out.println("ic1 fonk.." + iD);
		}
	}

}
