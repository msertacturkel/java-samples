public class MusteriyeServisUygulamasi {

	public static void main(String[] args) {

		// Restoran'in bilgileri giriliyor
		Adres restAdresi = new Adres("Istanbul", "Sisli", "Mecidiyekoy",
				"cicek", 3);
		Restorant rest = new Restorant("Mecidiyekoy Esnaf Lokantasi", "esnaf",
				100, restAdresi);
		rest.info();// restorant bilgisi
		// Personel'in bilgileri giriliyor
		//System.out.println("*****Hizmet eden personel******");
		Tarih dogumTarihi = new Tarih(1987, 10, 23);
		Personel per = new Personel("Hakan", "Guler", "2312122", dogumTarihi);
		//per.info();//personel bilgisi
		//Siparis veriliyor
		System.out.println(" *** Siparis bilgisi ****");
		Musteri musteri=new Musteri(2, 5);
		Menu menu=new Menu(2, "Mercimek Corbasi");
		Tarih siparisTarihi=new Tarih(2013, 9, 21);
		Siparis sip=new Siparis(siparisTarihi, 1, menu, musteri, per);
		sip.info();
	}

}
