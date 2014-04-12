package DAO;

public class Personel {

	// Plain Old Java Object (POJO)
	private int id;
	private String ad;
	private String soyad;
	private int maas;

	public Personel() {
		// TODO Auto-generated constructor stub
	}

	public Personel(int id, String ad, String soyad, int maas) {
		this.id = id;
		this.ad = ad;
		this.soyad = soyad;
		this.maas = maas;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getMaas() {
		return maas;
	}

	public void setMaas(int maas) {
		this.maas = maas;
	}

}