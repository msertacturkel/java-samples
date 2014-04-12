

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Daire extends JPanel {
	public Daire() {
		JFrame jf=new JFrame();
		jf.setVisible(true);
		jf.setBounds(100, 100, 300, 300);
		Container con = jf.getContentPane();
		con.add(this);
	}

	public void paint(Graphics g) {
		setBackground(Color.white);
		g.drawOval(100, 100, 20, 20);
	}

	public static void main(String[] args) {
		Daire da = new Daire();
		
		
	}

}
