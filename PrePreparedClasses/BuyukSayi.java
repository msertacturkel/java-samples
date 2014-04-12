import java.math.BigInteger;


public class BuyukSayi {

	public static void main(String[] args) {
		BigInteger b1=new BigInteger("123456789123456789123456789");
		BigInteger b2=new BigInteger("323456789123456789123456789");
		BigInteger toplam = b1.add(b2);
		BigInteger carpim = b1.multiply(b2);
		System.out.println(toplam);
		System.out.println(carpim);
	}

}
