package arrayOp;

public class MultipleDimArray {

	public static void main(String[] args) {
		int m[][] = { { 1, 2, 4 }, { 1, 4, 8 }, { 2, 3, 6 }, { 2, 3, 7 } };
		System.out.println(m.length);// Alt dizi sayisi, matris olursa satir
										// sayisi
		
		System.out.println(m[2].length);// 3. alt dizinin(indis'i 2) uzunlugu
		
		System.out.println(m[2][2]);// 2 indisli(3.) alt dizinin 3 indisli (4.)
									// elemani
		
		for (int i = 0; i < m.length; i++) {// Alt dizileri dolasir
			for (int j = 0; j < m[i].length; j++) {// i.ci alt dizi icinde
													// dolasir
				System.out.print(m[i][j] + "\t");// i.ci alt dizinin j.ci
													// elemani

			}
			System.out.println();// satir atlatir
		}
	}

}
