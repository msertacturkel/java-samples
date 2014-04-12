package sample2sekil;

public class Boyut {
	private Sekil s;
	public Boyut( Sekil s) {
		//Sekil s=da; //constructor
		//upcast constructor'da saglaniyor
		this.s=s;
	}
	
	public double alan3k(){
		//s upcast nesnesi
		return 3 * s.alan();
		//constructor'a gönderilen turmis sinifin alan metodu cagrilir
	}
}
