package events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class removelistener extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel text;
	private JButton add;
	private JCheckBox active;
	private ButtonListener buttonlistener;
	private static int count = 0;
	
	removelistener(){
		
		setTitle("Remove listener");
		JPanel panel=new JPanel();
		panel.setLayout(null);
		
		add=new JButton("+");
		add.setBounds(40, 30, 80, 25);
		buttonlistener = new ButtonListener();
		panel.add(add);
		
		active=new JCheckBox("Active listener");
		active.setBounds(160, 30, 140, 25);
		
		active.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent event) {
				if (active.isSelected()) {
					
					add.addActionListener(buttonlistener);}
					
				else {
					
					add.removeActionListener(buttonlistener);
					
				}
				
			}
		});
		panel.add(active);
		
		text = new JLabel("0");
		text.setBounds(40, 80, 80, 25);
		panel.add(text);
		
		add(panel);
		setSize(310, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e)
		{
			text.setText(Integer.toString(++count));
		}
	}
	
	public static void main(String[] args){
		new removelistener();
	}
}
