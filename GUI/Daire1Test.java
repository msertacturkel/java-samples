import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.WindowConstants;


public class Daire1Test {

	public static void main(String[] args) {
		JFrame jf=new JFrame();
		jf.setVisible(true);
		jf.setBounds(100,100,300,300);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		Container con = jf.getContentPane();
		con.setLayout(new BorderLayout());
		con.add(new Daire1(),BorderLayout.CENTER);

	}

}
