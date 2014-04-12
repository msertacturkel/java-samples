package exceptions;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class MultipleErrorFunc {

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("");
		} catch (ClassNotFoundException e) {
			System.out.println("Sinif yükleme hatasi");
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
	}

}
