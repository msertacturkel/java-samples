package gonderilecek_kod;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class SharedDataBetweenComboBoxAndListSample {
  public static void main(String args[]) {
    final String labels[] = { "A", "B", "C", "D", "E", "F", "G" };

    final DefaultComboBoxModel model = new DefaultComboBoxModel(labels);

    JFrame frame = new JFrame("Shared Data");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel panel = new JPanel();
    JComboBox comboBox1 = new JComboBox(model);
    comboBox1.setEditable(true);

    panel.add(comboBox1);
    frame.add(panel, BorderLayout.NORTH);

    JList jlist = new JList(model);
    JScrollPane scrollPane = new JScrollPane(jlist);
    frame.add(scrollPane, BorderLayout.CENTER);


    JButton button = new JButton("Add");
    frame.add(button, BorderLayout.SOUTH);
    ActionListener actionListener = new ActionListener() {
      public void actionPerformed(ActionEvent actionEvent) {
        model.addElement("New Added");
      }
    };
    button.addActionListener(actionListener);

    frame.setSize(300, 200);
    frame.setVisible(true);
  }
}