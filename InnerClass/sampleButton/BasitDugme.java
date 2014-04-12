import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BasitDugme extends JFrame {

	private JButton dugme;

	public BasitDugme() {
		Container con = getContentPane();
		con.setLayout(new FlowLayout());
		dugme = new JButton("  Bas  ");
		Bas bas = new Bas();// ActionListener'dan turemis
		dugme.addActionListener(bas);// upcast ActionListener l=bas;
		con.add(dugme);

	}

	// Turemis sinif
	private class Bas implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			dugme.setText("basildi");

		}
	}

	public static void main(String[] args) {
		BasitDugme basit = new BasitDugme();
		basit.setVisible(true);
		basit.setBounds(100, 100, 300, 300);

	}

}
