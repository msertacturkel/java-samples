public class Tarih {

	int yil, ay, gun;

	public Tarih(int yil, int ay, int gun) {
		this.yil = yil;
		this.ay = ay;
		this.gun = gun;
	}

	public int getYil() {
		return yil;
	}

	public void setYil(int yil) {
		this.yil = yil;
	}

	public int getAy() {
		return ay;
	}

	public void setAy(int ay) {
		this.ay = ay;
	}

	public int getGun() {
		return gun;
	}

	public void setGun(int gun) {
		this.gun = gun;
	};

	public void info() {
		System.out.println(gun + "/" + ay + "/" + yil);
	}
}
