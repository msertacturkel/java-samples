public class Personel {

	String ad, soyad;
	String tcKNo;
	Tarih dogumTarihi;

	public Personel(String ad, String soyad, String tcKNo, Tarih dogumTarihi) {
		this.ad = ad;
		this.soyad = soyad;
		this.tcKNo = tcKNo;
		this.dogumTarihi = dogumTarihi;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public String getTcKNo() {
		return tcKNo;
	}

	public void setTcKNo(String tcKNo) {
		this.tcKNo = tcKNo;
	}

	public Tarih getDogumTarihi() {
		return dogumTarihi;
	}

	public void setDogumTarihi(Tarih dogumTarihi) {
		this.dogumTarihi = dogumTarihi;
	}

	public void info(){
		System.out.println("Ad:"+ad);
		System.out.println("Soyad:"+soyad);
		System.out.println("Tck No:"+tcKNo);
		dogumTarihi.info();
	}
}
