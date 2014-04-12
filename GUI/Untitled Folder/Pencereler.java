

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Pencereler implements ActionListener{
private List<JButton> jbList=new ArrayList<JButton>();
private JFrame jf1;
private JFrame jf2;
	public Pencereler() {
     
     jf1=new JFrame();
     Container con1 = jf1.getContentPane();
     con1.setLayout(new GridLayout(2, 3));
     for(int i=1;i<=6;i++){
    	 JButton jb=new JButton(i+"");
    	 jb.addActionListener(this);
    	 con1.add(jb);
     }
     jf1.setBounds(100, 100, 200, 200);
     jf1.setVisible(true);
     
     jf2=new JFrame();
     
     jf2.setBounds(100, 100, 200, 200);
     Container con2 = jf2.getContentPane();
     con2.setLayout(new GridLayout(2, 3));
     for(int i=7;i<=12;i++){
    	 JButton jb=new JButton(i+"");
    	 jb.addActionListener(this);
    	 con2.add(jb);
     }
     JFrame jf3=new JFrame();
     Container con3 = jf3.getContentPane();
	}
	public static void main(String[] args) {
		new Pencereler();

	}
	
	public void actionPerformed(ActionEvent e) {
		JButton jb=(JButton)e.getSource();
		jbList.add(jb);
		System.out.println(jb.getText());
		jf1.setVisible(false);
		jf2.setVisible(true);
	}

}
