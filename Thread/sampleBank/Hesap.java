
public class Hesap {

	private int bakiye;

	//Baslangic parasi yatiriliyor
	public Hesap(int bakiye) {
		this.bakiye = bakiye;
	}
	
	public void paraCek(int miktar){
		bakiye-=miktar;
	}
	
	public void paraYatir(int miktar){
		bakiye+=miktar;
	}
	
	public int info(){
		return bakiye;
	}
}
