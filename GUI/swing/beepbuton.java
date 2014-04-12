package swing;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class beepbuton extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Toolkit toolkit;
	
	public beepbuton(){
		createGui();
		
	}
	public void createGui(){
		setTitle("Buttons");
		setSize(300,200);
		final Toolkit toolkit=getToolkit();
		Dimension size=toolkit.getScreenSize();
		setLocation((size.width - getWidth())/2, (size.height -
				getHeight())/2);
				setDefaultCloseOperation(EXIT_ON_CLOSE);
				
		JPanel a=new JPanel();
		getContentPane().add(a);
		a.setLayout(null);
		a.setToolTipText("A Panel container");
		
		JButton beep=new JButton("beep");
		beep.setBounds(150,60,80,30);
		
		beep.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent event){
				toolkit.beep();				
			}			
		});
		//////*********************////////////////
		JButton close=new JButton("close");
		close.setBounds(50,60,80,30);
		close.setToolTipText("A button component");
		
		close.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				System.exit(0);
			}
		});
		a.add(beep);
		a.add(close);
	}
	
	public static void main(String[] args){
		beepbuton x=new beepbuton();
		x.setVisible(true);
		
	}
}
