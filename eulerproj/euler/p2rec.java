package euler;

public class p2rec {
	private static int toplam;
	public static void main(String[] args) {
		toplam = 0;
		for (int i = 0; i < 1000; i++) {
			int sayi2=rec(i);
			if(sayi2>=40000) break;
			if(sayi2%2==0) toplam+=sayi2; 
			//System.out.print(sayi2+"    t:"+ toplam+"      "
			//		);
		}
		System.out.println(toplam);
		
		
		
	}
	public static int rec(int x){
		if(x==0 || x==1) return 1;		
		else return rec(x-1)+rec(x-2);
		
	}

}
