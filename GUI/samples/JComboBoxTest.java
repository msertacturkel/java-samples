package gonderilecek_kod;

import java.awt.FlowLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class JComboBoxTest {
  public static void main(String[] args) {
    JFrame.setDefaultLookAndFeelDecorated(true);
    JFrame frame = new JFrame("JComboBox Test");
    frame.setLayout(new FlowLayout());
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    String[] selections = { "green", "red", "orange", "dark blue" };
    @SuppressWarnings("unchecked")
	JComboBox comboBox = new JComboBox(selections);
    comboBox.setSelectedIndex(1);
    System.out.println(comboBox.getSelectedItem());
    frame.add(comboBox);
    frame.pack();
    frame.setVisible(true);
  }
}