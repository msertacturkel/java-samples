import java.util.Scanner;
import java.util.StringTokenizer;

public class Parser {

	public Parser() {
		System.out.print("islem girin: orn (3*4-2/5+3)");
		String okunan = klavyedenOku();		
		String[] str = parcala(okunan);
		double sonuc=Double.parseDouble(str[0]);
		for(int i=1;i<str.length;i+=2){
			String op=str[i].trim();
			double sayi=Double.parseDouble(str[i+1]);
			if(op.equals("+")) sonuc+=sayi;
			if(op.equals("-")) sonuc-=sayi;
			if(op.equals("*")) sonuc*=sayi;
			if(op.equals("/")) sonuc/=sayi;
		}	//for
		System.out.println(sonuc);		
	}

	private String[] parcala(String okunan) {

		StringTokenizer st = new StringTokenizer(okunan, "+-*/", true);
		int elemanSayisi = st.countTokens();
		String dizi[] = new String[elemanSayisi];
		for (int i = 0; i < elemanSayisi; i++) {
			dizi[i] = st.nextToken();
		}
		return dizi;
	}

	private String klavyedenOku() {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		return str;
	}

	public static void main(String[] args) {
		new Parser();

	}

}
