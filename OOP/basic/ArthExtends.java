package basic;

import math.Arithmetic;

public class ArthExtends extends Arithmetic{
	public int yeniCikarma(int a, int b){
		//int aa=topla(a, b);
		int bb=super.cikarma(a, b);	//Aritmetik sinifinin 
		//cikarma metodu cagriliyor
		return bb;
	}

}
