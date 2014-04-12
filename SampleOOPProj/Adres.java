public class Adres {

	String il, ilce, cadde;
	String aptAd;
	int daireNo;

	public Adres(String il, String ilce, String cadde, String aptAd, int daireNo) {
		this.il = il;
		this.ilce = ilce;
		this.cadde = cadde;
		this.aptAd = aptAd;
		this.daireNo = daireNo;
	}

	public String getIl() {
		return il;
	}

	public void setIl(String il) {
		this.il = il;
	}

	public String getIlce() {
		return ilce;
	}

	public void setIlce(String ilce) {
		this.ilce = ilce;
	}

	public String getCadde() {
		return cadde;
	}

	public void setCadde(String cadde) {
		this.cadde = cadde;
	}

	public String getAptAd() {
		return aptAd;
	}

	public void setAptAd(String aptAd) {
		this.aptAd = aptAd;
	}

	public int getDaireNo() {
		return daireNo;
	}

	public void setDaireNo(int daireNo) {
		this.daireNo = daireNo;
	}
	
	public void info(){
		System.out.println("il:"+il);
		System.out.println("ilce:"+ilce);
		System.out.println("cadde:"+cadde);
		System.out.println("apartman:"+aptAd);
		System.out.println("daire no:"+daireNo);
		
	}

}
