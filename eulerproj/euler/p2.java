package euler;

public class p2 {
	public static void main(String[] args) {
		int temp = 0;
		int toplam = 0;
		int sayi1 = 1;
		int sayi2 = 1;
		int cifttoplam=0;
		while (toplam < 40000) {
			temp = sayi2;
			sayi2 = sayi1 + sayi2;
			if(sayi2%2==0){cifttoplam+=sayi2;}
			sayi1 = temp;
			toplam = sayi2 + sayi1;
			System.out.println("cift sayi toplami	:"+cifttoplam);
		}
	}

}
