package arrayOp;

public class ArrayCopy {

	public static void main(String[] args) {
		int dizi[] = { 1, 2, 3, 4, 5, 6 };
		// System.out.println("dizi'nin adresi:"+dizi);
		// int dizi[];
		// dizi=new int[]{1,2,3,4,5,6};
		// dizi dizisinin boyunda ici 0'la dolu bir dizi2 olusturuyoruz
		int dizi2[] = new int[dizi.length];// dizi.length dizi'nin uzunlugunu
											// verir
		// System.out.println("dizi2'nin ilk adresi:"+dizi2);
		// dizi2 = dizi;//dizi kopyalama (mi?)Hayir adres kopyalamasi yapiliyor
		/*
		 * for (int i = 0; i < dizi2.length; i++) {
		 * System.out.println(dizi2[i]); }
		 */
		// System.out.println("dizi2'nin kopyalandiktan sonraki adresi:"+dizi2);
		// dizi2[0]=100;
		// System.out.println(dizi[0]);

		// dizi'nin elemanlari tek tek dizi2'ye kopyalaniyor
		/*
		 * for (int i = 0; i < dizi.length; i++) { dizi2[i] = dizi[i]; }
		 */
		System.arraycopy(dizi, 0, dizi2, 0, dizi.length);// dizi kaynak, dizi2
															// hedef
		// Copies an array from the specified source array, beginning at the
		// specified position,
		// to the specified position of the destination array.
		for (int i = 0; i < dizi2.length; i++) {
			System.out.println(dizi2[i]);
		}

	}

}
