public class Restorant {
	String ad, tip;
	int kapasite;
	Adres adres;

	public Restorant(String ad, String tip, int kapasite, Adres adres) {
		this.ad = ad;
		this.tip = tip;
		this.kapasite = kapasite;
		this.adres = adres;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public int getKapasite() {
		return kapasite;
	}

	public void setKapasite(int kapasite) {
		this.kapasite = kapasite;
	}

	public Adres getAdres() {
		return adres;
	}

	public void setAdres(Adres adres) {
		this.adres = adres;
	}
	
	public void info(){
		
		System.out.println("Ad:"+ad);
		System.out.println("Tip:"+tip);
		System.out.println("Kapasite:"+kapasite);
		System.out.println("Adres:");
		adres.info();//Adres'in info'su cagriliyor
	}
	

}
