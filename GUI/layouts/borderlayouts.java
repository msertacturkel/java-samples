import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.Box;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;

public class borderlayouts extends JApplet {
  public void init() {
    Box bv = Box.createVerticalBox();
    for (int i = 0; i < 5; i++)
      bv.add(new JButton("bv " + i));
    Box bh = Box.createHorizontalBox();
    for (int i = 0; i < 5; i++)
      bh.add(new JButton("bh " + i));
    Container cp = getContentPane();
    cp.add(BorderLayout.EAST, bv);
    cp.add(BorderLayout.SOUTH, bh);
  }

  public static void main(String[] args) {
    run(new borderlayouts(), 450, 200);
  }

  public static void run(JApplet applet, int width, int height) {
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(applet);
    frame.setSize(width, height);
    applet.init();
    applet.start();
    frame.setVisible(true);
  }
}