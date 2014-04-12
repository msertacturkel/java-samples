package controlStmts;

public class SwitchCaseExLetters {

	public static void main(String[] args) {
		for (int i = 1; i <= 20; i++) {

			// int sayi=1+(int)(Math.random()*26);
			char c = (char) ('A' + Math.random() * 26);
			// int sayi='A'+3;
			// char sayi=(char)('A'+i);

			switch (c) {
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				System.out.println(c + " sesli");
				break;
			default:
				System.out.println(c + " sessiz");
			}
		}
	}

}
