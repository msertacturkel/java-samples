import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


public class IkiDugmeIcSinifYok extends JFrame implements ActionListener{
private JButton dugme1,dugme2;
	//Dugmelerden birisi kirmizi digeri mavi olsun
	//Basilan dugmenin üzerinde basildi yazsin ve kirmizi renkli olsun
	//Diger dugme ise mavi renkli ve üzerinde bas yazsin
	
	public IkiDugmeIcSinifYok() {
		Container con=this.getContentPane();
		con.setLayout(new FlowLayout());
		con.setBackground(Color.white);
		dugme1=new JButton("bas");
		dugme2=new JButton("bas");
		dugme1.setBackground(Color.red);
		dugme2.setBackground(Color.blue);		
		dugme1.addActionListener(this);//upcast
		dugme2.addActionListener(this);//upcast
		con.add(dugme1);
		con.add(dugme2);
	}
	
	
	public void actionPerformed(ActionEvent e) {
		JButton dugme=(JButton)e.getSource();
		
		if(dugme==dugme1){
			dugme1.setText("basildi");
			dugme2.setText("bas");
			dugme1.setBackground(Color.red);
			dugme2.setBackground(Color.blue);
			
		}
		else{
			dugme2.setText("basildi");
			dugme1.setText("bas");
			dugme2.setBackground(Color.red);
			dugme1.setBackground(Color.blue);
		}
		
	}
	
	public static void main(String[] args) {
		IkiDugmeIcSinifYok iki=new IkiDugmeIcSinifYok();
		iki.setBounds(100, 100, 300, 300);
		iki.setVisible(true);
		

	}
	

}
