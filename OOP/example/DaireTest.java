package example;

public class DaireTest {

	public static void main(String[] args) {
		Daire d = new Daire(10);
		double alan = d.alan();
		double cevre = d.cevre();

		// JOptionPane.showMessageDialog(null, "alan:"+alan);
		System.out.println("alan:" + alan);
		System.out.println("cevre:" + cevre);

	}

}
