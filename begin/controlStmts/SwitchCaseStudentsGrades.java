package controlStmts;

import java.util.Scanner;

public class SwitchCaseStudentsGrades {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Not giriniz:(1-5)");
		int not = sc.nextInt();
		// switch-case yapisi ayrik deger durumlarinda kullanilir
		// The type of the value must be char, byte, short, int, Character,
		// Byte, Short, Integer, String, or an enum type
		switch (not) {
		case 1:
			System.out.println("pek zayif");
			break;
		case 2:
			System.out.println("zayif");
			break;
		case 3:
			System.out.println("orta");
			break;
		case 4:
			System.out.println("iyi");
			break;
		case 5:
			System.out.println("pek iyi");
			break;

		default:
			System.out.println("gecersiz not");
		}

	}

}
