package boyut;

public class HangiSinifTest {

	public static void main(String[] args) {
		Daire da=new Daire(10);
		Dikdortgen di=new Dikdortgen(3,5);
		Object o1=da;
		Object o2=di;
		//Buradayiz
		if(o1 instanceof Daire){
			Daire daa=(Daire)o1;			
		}
		//
	}

}
