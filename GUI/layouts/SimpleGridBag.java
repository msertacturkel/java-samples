import java.awt.GridBagLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SimpleGridBag {

  @SuppressWarnings("deprecation")
public static void main(String[] args) {
    JFrame f = new JFrame();
    JPanel p = new JPanel();

    p.setLayout(new GridBagLayout());
    p.add(new JButton("Java"));
    p.add(new JButton("Source"));
    p.add(new JButton("and"));
    p.add(new JButton("Support."));

    WindowListener wndCloser = new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
    };
    f.addWindowListener(wndCloser);

    f.getContentPane().add(p);
    f.setSize(600, 200);
    f.show();
  }
}
           