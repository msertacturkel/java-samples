public class Siparis {

	Tarih tarih;
	int siparisNo;
	Menu menu;
	Musteri musteri;
	Personel personel;

	public Siparis(Tarih tarih, int siparisNo, Menu menu, Musteri musteri,
			Personel personel) {
		this.tarih = tarih;
		this.siparisNo = siparisNo;
		this.menu = menu;
		this.musteri = musteri;
		this.personel = personel;
	}

	public Tarih getTarih() {
		return tarih;
	}

	public void setTarih(Tarih tarih) {
		this.tarih = tarih;
	}

	public int getSiparisNo() {
		return siparisNo;
	}

	public void setSiparisNo(int siparisNo) {
		this.siparisNo = siparisNo;
	}

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	public Musteri getMusteri() {
		return musteri;
	}

	public void setMusteri(Musteri musteri) {
		this.musteri = musteri;
	}

	public Personel getPersonel() {
		return personel;
	}

	public void setPersonel(Personel personel) {
		this.personel = personel;
	}

	public void info() {
		System.out.println("****Siparis tarihi***");
		tarih.info();
		System.out.println("siparis no:" + siparisNo);
		System.out.println(" **** Menu ****");
		menu.info();
		System.out.println("*** Musteri ******");
		musteri.info();
		System.out.println(" ***** Personel *******");
		personel.info();
	}
}
