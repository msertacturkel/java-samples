package sample2sekil;

public class BoyutTest {

	public static void main(String[] args) {
		
		Daire da=new Daire(10);
		Dikdortgen di=new Dikdortgen(3,4);
		Ucgen uc=new Ucgen(3,4,5);
		Boyut b1=new Boyut(da);//upcast
		Boyut b2=new Boyut(di);
		Boyut b3=new Boyut(uc);
		double alanDaire3k=b1.alan3k();
		double alanDikdortgen3k=b2.alan3k();
		System.out.println(alanDaire3k);
		System.out.println(alanDikdortgen3k);
		System.out.println(b3.alan3k());
		
		
	}

}