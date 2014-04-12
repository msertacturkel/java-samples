
public class Musteri {

	int masaNo;
	int musteriNo;
	public Musteri(int masaNo, int musteriNo) {
		this.masaNo = masaNo;
		this.musteriNo = musteriNo;
	}
	public int getMasaNo() {
		return masaNo;
	}
	public void setMasaNo(int masaNo) {
		this.masaNo = masaNo;
	}
	public int getMusteriNo() {
		return musteriNo;
	}
	public void setMusteriNo(int musteriNo) {
		this.musteriNo = musteriNo;
	}
	
	void info(){
		System.out.println("Masa No:"+masaNo);
		System.out.println("Musteri No:"+musteriNo);
	}
}
