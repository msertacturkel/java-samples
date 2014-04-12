import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;

import javax.swing.JFrame;

public class ZiplayanToplar extends JFrame {

	private Color topRengi=Color.red;
	public ZiplayanToplar() {
		setBounds(200, 200, 200, 200);
		topCiz();
	}

	private void topCiz() {
       Container con=getContentPane();
	}
	
	public void paint(Graphics g) {
		g.setColor(topRengi);
		g.fillOval(100, 100, 20, 20);
	}
	public static void main(String[] args) {
		new ZiplayanToplar().setVisible(true);

	}

}
