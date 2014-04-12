package swing;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.print.DocFlavor.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class menubar extends JFrame{
	public menubar(){
		createGui();
	}
	public void createGui(){
		setTitle("MenuBar");
		JMenuBar mnbr=new JMenuBar();
		ImageIcon img=new ImageIcon(getClass().getResource("/resources/soup.png"));
		
	
		
		
		JMenu file=new JMenu("File");
		file.setMnemonic(KeyEvent.VK_F);
		
		JMenuItem fileClose=new JMenuItem("Close",img);
		fileClose.setMnemonic(KeyEvent.VK_C);
		fileClose.setToolTipText("Dosya secin..");
		
		fileClose.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent event) {
					System.exit(0);
				
					}
				});
		file.add(fileClose);
		mnbr.add(file);
		setJMenuBar(mnbr);
		setSize(250,200);
		setLocationRelativeTo(null);
			
	}
	public static void main(String[] args){
		menubar mn=new menubar();
		mn.setVisible(true);
		
	}
}
