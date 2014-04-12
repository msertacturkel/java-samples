import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Daire1 extends JPanel {

	public void paint(Graphics gr) {
		gr.setColor(Color.red);		
		gr.fillOval(50, 50, 20, 20);
	}
}
