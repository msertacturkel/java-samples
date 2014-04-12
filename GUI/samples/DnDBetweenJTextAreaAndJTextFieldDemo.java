package gonderilecek_kod;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class DnDBetweenJTextAreaAndJTextFieldDemo {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Drag and Drop Demo");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setContentPane(new JPanel());
    JTextField textField = new JTextField(25);
    textField.setText("www.java2s.com");
    frame.add(textField);

    JTextArea textArea = new JTextArea(4, 25);
    textArea.setText("Demonstrating\ndrag and drop");
    frame.getContentPane().add(new JScrollPane(textArea));
    textArea.setDragEnabled(true);
    textField.setDragEnabled(true);
    frame.pack();
    frame.setVisible(true);

  }
}