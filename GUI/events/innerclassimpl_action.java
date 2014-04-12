package events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class innerclassimpl_action extends JFrame {
	public innerclassimpl_action(){
		setTitle("Simle Event");
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		JButton close = new JButton("Close");
		close.setBounds(40, 50, 80, 25);
		close.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				System.exit(0);
			}
		});
		
		panel.add(close);
		add(panel);
		setSize(300, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new innerclassimpl_action();
		}
}
