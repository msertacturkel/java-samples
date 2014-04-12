package aritmetikOp;

public class IntegerDiffBase {

	public static void main(String[] args) {
		int a1=0101;//(octal=sekiz)1*8^0+0*8^1+1*8^2=1+64=65
		int a2=0x41;//(hexadecimal=onalti) 1*16^0+4*16^1=1+4*16=65
		//int a3=0b01000001;//(binary=iki) 1*2^0+0*2^1+..1*2^6+0*2^7=65 java1.7
		System.out.println(a1);
		System.out.println(a2);
		//System.out.println(a3); java1.7
	}
}
