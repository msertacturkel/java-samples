package boyut;

public class Boyut4Test {

	public static void main(String[] args) {
		Daire da=new Daire(10);
		Dikdortgen di=new Dikdortgen(3,5);
		Elma elma=new Elma();
		Boyut4 b1=new Boyut4(da);
		Boyut4 b2=new Boyut4(di);
		Boyut4 b3=new Boyut4(elma);
		double daireAlan3k=b1.alan3k();
		double dikdortgenAlan3k=b2.alan3k();
		System.out.println("Daire:"+daireAlan3k);
		System.out.println("Dikdortgen:"+dikdortgenAlan3k);
		System.out.println("Elma:"+b3.alan3k());
	}

}
