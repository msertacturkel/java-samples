public class Menu {

	int menuGrupNo;
	String menuAdi;

	public Menu(int menuGrupNo, String menuAdi) {
		this.menuGrupNo = menuGrupNo;
		this.menuAdi = menuAdi;
	}

	public int getMenuGrupNo() {
		return menuGrupNo;
	}

	public void setMenuGrupNo(int menuGrupNo) {
		this.menuGrupNo = menuGrupNo;
	}

	public String getMenuAdi() {
		return menuAdi;
	}

	public void setMenuAdi(String menuAdi) {
		this.menuAdi = menuAdi;
	}

	public void info(){
		System.out.println("Menu grubu:"+menuGrupNo);
		System.out.println("Menu Adi:"+menuAdi);
	}
}
