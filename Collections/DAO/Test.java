package DAO;

import java.util.List;


public class Test {

	public static void main(String[] args) {
		DosyaDAO d=new DosyaDAO();
		List<Personel> pers = d.findAll();
		for (Personel personel : pers) {
			System.out.println(personel.getAd()+"\t"+personel.getMaas());
		}

	}

}