import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


public class IkiDugme extends JFrame{
private JButton dugme1,dugme2;
	//Dugmelerden birisi kirmizi digeri mavi olsun
	//Basilan dugmenin üzerinde basildi yazsin ve kirmizi renkli olsun
	//Diger dugme ise mavi renkli ve üzerinde bas yazsin
	
	public IkiDugme() {
		Container con=this.getContentPane();
		con.setLayout(new FlowLayout());
		con.setBackground(Color.white);
		dugme1=new JButton("bas");
		dugme2=new JButton("bas");
		dugme1.setBackground(Color.red);
		dugme2.setBackground(Color.blue);
		Bas1 b1=new Bas1();
		Bas2 b2=new Bas2();
		dugme1.addActionListener(b1);//upcast
		dugme2.addActionListener(b2);//upcast
		con.add(dugme1);
		con.add(dugme2);
	}
	
	private class Bas1 implements ActionListener{

		
		public void actionPerformed(ActionEvent e) {
			dugme1.setText("basildi");
			dugme2.setText("bas");
			dugme1.setBackground(Color.red);
			dugme2.setBackground(Color.blue);
		}}
	
	private class Bas2 implements ActionListener{

		
		public void actionPerformed(ActionEvent e) {
			dugme2.setText("basildi");
			dugme1.setText("bas");
			dugme2.setBackground(Color.red);
			dugme1.setBackground(Color.blue);
			
		}}
	public static void main(String[] args) {
		IkiDugme iki=new IkiDugme();
		iki.setBounds(100, 100, 300, 300);
		iki.setVisible(true);
		

	}

}
