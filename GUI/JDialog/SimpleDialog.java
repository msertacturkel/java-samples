import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class SimpleDialog extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	SimpleDialog(){
		
		setTitle("Simple Dialog");
		
		JMenuBar menubar = new JMenuBar();
		
		JMenu file = new JMenu("File");
		file.setMnemonic(KeyEvent.VK_F);
		menubar.add(file);
		
		JMenu help = new JMenu("Help");
		help.setMnemonic(KeyEvent.VK_H);
		menubar.add(help);
		
		JMenuItem about = new JMenuItem("About");
		help.add(about);
		about.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
			AboutDialog ad = new AboutDialog();
			ad.setVisible(true);
			}
		});
		
		
		setJMenuBar(menubar);
		setSize(300, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	
	}
public static void main(String[] args){
	new SimpleDialog();
	
	}
}
