package gonderilecek_kod;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class ATitledBorder {
  public static void main(String args[]) {
    JFrame frame = new JFrame("Titled Borders");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    Border thisBorder = BorderFactory.createTitledBorder("Easy");
    
    Border thatBorder1 = new LineBorder(Color.RED);
    Border thatBorder2 = new TitledBorder(thatBorder1, "Harder");
    
    Font font = new Font("Serif", Font.ITALIC, 12);
    Border thatBorder = new TitledBorder(thatBorder2, "Harder", TitledBorder.LEFT,
        TitledBorder.ABOVE_BOTTOM, font, Color.RED);
    
    JButton thisButton = new JButton("Easy");
    thisButton.setBorder(thisBorder);
    
    JButton thatButton = new JButton("Harder");
    thatButton.setBorder(thatBorder);
    
    Container contentPane = frame.getContentPane();
    contentPane.setLayout(new GridLayout(1, 2));
    contentPane.add(thisButton);
    contentPane.add(thatButton);
    frame.setSize(300, 200);
    frame.setVisible(true);
  }
}