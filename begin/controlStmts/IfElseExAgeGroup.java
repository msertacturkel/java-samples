package controlStmts;

import java.util.Scanner;

public class IfElseExAgeGroup {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Yas giriniz:");
		double yas = sc.nextDouble();
		// System.out.println(yas);
		if ((yas < 0))
			System.out.println("yas negatif olamaz..");
		else if (yas <= 3)
			System.out.println("bebek");
		else if (yas <= 14)
			System.out.println("cocuk");
		else if (yas <= 18)
			System.out.println("ergen");
		else if (yas <= 30)
			System.out.println("genc");
		else
			System.out.println("yasli..");
	}
}
