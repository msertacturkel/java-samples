package gonderilecek_kod;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class StoringvalueinVectorandaddingthemintoJList {

  public static void main(String[] a) {
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Vector months = new Vector();
    JList list = new JList(months);

    months.addElement("January");
    months.addElement("December");

    frame.add(new JScrollPane(list));

    frame.setSize(300, 200);
    frame.setVisible(true);
  }

}