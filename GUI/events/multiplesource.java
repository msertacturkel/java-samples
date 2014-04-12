package events;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;

public class multiplesource extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel statusbar;
		
	public multiplesource(){
		
		setTitle("Multiple Sources");
		JPanel panel = new JPanel();
		
		statusbar = new JLabel(" ZetCode");
		statusbar.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
		panel.setLayout(null);
		
		JButton close = new JButton("Close");
		close.setBounds(40, 30, 80, 25);
		close.addActionListener(new ButtonListener());
		
		JButton open = new JButton("Open");
		open.setBounds(40, 80, 80, 25);
		open.addActionListener(new ButtonListener());
		
		JButton find = new JButton("Find");
		find.setBounds(40, 130, 80, 25);
		find.addActionListener(new ButtonListener());
		
		JButton save = new JButton("Save");
		save.setBounds(40, 180, 80, 25);
		save.addActionListener(new ButtonListener());
			
		panel.add(close);
		panel.add(open);
		panel.add(find);
		panel.add(save);
		add(panel);
		
		add(statusbar, BorderLayout.SOUTH);
		setSize(400, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		
	}
	public static void main(String[] args){
		new multiplesource();
	}
	class ButtonListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e)
		{
			JButton o = (JButton) e.getSource();
			String label = o.getText();
			statusbar.setText(" " + label + " button clicked");
			
		}
	}
}
