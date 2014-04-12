package arrayOp;

public class Array {

	public static void main(String[] args) {
		// int d[10]; C'de stack'de 10 elemanli int dizisi
		// int *d1=(int*)malloc(10*sizeof(int));C'de 10 elemanli dinamik
		// dizi(heap)
		// int *c2=new int[10];C++'da dinamik dizi(heap)
		int c2[] = new int[10];// Java'da 10 elemanli dizi(heap)
		int dizi[];// *dizi
		int d[] = { -2, 0, 1, 4, 3, 5, -7, 6, 9, 1, 4 };
		for (int i = 0; i < d.length; i++) {
			System.out.println(i + "->" + d[i]);
		}
		System.out.println("*******************");
		// Swap 
		int temp = d[0];
		d[0] = d[5];
		d[5] = temp;
		for (int i = 0; i < d.length; i++) {
			System.out.println(i + "->" + d[i]);
		}
	}

}
