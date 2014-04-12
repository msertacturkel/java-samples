package swing;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JToolBar;



public class toolbar extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public toolbar(){
		createGui();
	}
	public void createGui(){
		setTitle("ToolBar");
		JMenuBar menubar=new JMenuBar();
		JMenu file=new JMenu();
		menubar.add(file);
		setJMenuBar(menubar);
		JToolBar toolbar=new JToolBar();
		ImageIcon icon=new ImageIcon(getClass().getResource("/resources/apple.png"));
		JButton exit= new JButton(icon);
		toolbar.add(exit);
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				System.exit(0);
				}
			});
		add(toolbar,BorderLayout.NORTH);
		setSize(300,200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
				
	}
	public static void main(String[] args) {
		new toolbar();
		}
}
