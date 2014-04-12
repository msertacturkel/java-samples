import java.math.BigInteger;


public class BigFaktoryel {

	public static void main(String[] args) {
		/*int fakt=1;
		for(int i=1;i<=10;i++)
			fakt*=i;
		System.out.println(fakt);*/
		BigInteger fakt=BigInteger.ONE;
		//BigInteger fakt=new BigInteger("1");
		for(int i=1;i<=1000;i++)
			fakt=fakt.multiply(BigInteger.valueOf(i));	//fakt=fakt*i;
		System.out.println(fakt);

	}

}
