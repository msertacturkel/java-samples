package events;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class tremissinifdinle extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public tremissinifdinle(){
		
		setTitle("Using inner class");
		JPanel panel = new JPanel();
		panel.setLayout(null);
		MyButton close = new MyButton("Close");
		close.setBounds(40, 50, 80, 25);
		panel.add(close);
		add(panel);
		
		setSize(300, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		}
	
	public static void main(String[] args){
		new tremissinifdinle();
	}
	
	class MyButton extends JButton implements ActionListener{
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		public MyButton(String text){
			super.setText(text);
			addActionListener(this);
			
		}
		public void actionPerformed(ActionEvent e)
		{
		System.exit(0);
		}
	}
}
