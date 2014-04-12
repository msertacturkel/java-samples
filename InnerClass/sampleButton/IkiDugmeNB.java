import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class IkiDugmeNB extends JFrame {
	private JButton dugme1, dugme2;

	public IkiDugmeNB() {
		initComponents();		
	}
	private void initComponents() {
		Container con = this.getContentPane();
		con.setLayout(new FlowLayout());
		con.setBackground(Color.white);
		dugme1 = new JButton("bas");
		dugme2 = new JButton("bas");
		dugme1.setBackground(Color.red);
		dugme2.setBackground(Color.blue);

		dugme1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dugme1ActionPermormed(e);
			}		
		});// upcast
		dugme2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dugme2ActionPermormed(e);
			}
		}
		);// upcast
		
		con.add(dugme1);
		con.add(dugme2);
		
	}
	
	private void dugme1ActionPermormed(ActionEvent e) {
		dugme1.setText("basildi");
		dugme2.setText("bas");
		dugme1.setBackground(Color.red);
		dugme2.setBackground(Color.blue);
		
	}
	private void dugme2ActionPermormed(ActionEvent e) {
		dugme2.setText("basildi");
		dugme1.setText("bas");
		dugme2.setBackground(Color.red);
		dugme1.setBackground(Color.blue);
		
	}
	public static void main(String[] args) {
		IkiDugmeNB iki = new IkiDugmeNB();
		iki.setBounds(100, 100, 300, 300);
		iki.setVisible(true);

	}

}
