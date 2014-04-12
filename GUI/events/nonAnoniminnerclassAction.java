package events;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class nonAnoniminnerclassAction extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public nonAnoniminnerclassAction(){
		
		setTitle("Using inner class");
		JPanel panel = new JPanel();
		panel.setLayout(null);
		JButton close = new JButton("Close");
		close.setBounds(40, 50, 80, 25);
		ButtonListener listener=new ButtonListener();
		close.addActionListener(listener);
		panel.add(close);
		add(panel);
		setSize(300, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e)
		{
		System.exit(0);
		}
		
	}
	
	public static void main(String[] args){
		new nonAnoniminnerclassAction();
		
		
	}
}
