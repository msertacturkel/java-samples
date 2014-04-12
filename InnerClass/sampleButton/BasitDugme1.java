import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BasitDugme1 extends JFrame implements ActionListener{

	private JButton dugme;

	public BasitDugme1() {
		Container con = getContentPane();
		con.setLayout(new FlowLayout());
		dugme = new JButton("  Bas  ");	
		dugme.addActionListener(this);// upcast ActionListener l=bas;
	
		con.add(dugme);

	}
	
	public void actionPerformed(ActionEvent e) {
	
		dugme.setText("basildi");
		
	}

	public static void main(String[] args) {
		BasitDugme1 basit = new BasitDugme1();
		basit.setVisible(true);
		basit.setBounds(100, 100, 300, 300);

	}

	

	

}
