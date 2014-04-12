package events;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.Calendar;
import javax.swing.BorderFactory;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.EtchedBorder;




public class multilistener extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JLabel statusbar;
	private JSpinner spinner;
	private static int count=0;
	
	public multilistener(){
	
		setTitle("Multiple Listeners");
		JPanel panel=new JPanel();
		statusbar=new JLabel("0");
		statusbar.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
		panel.setLayout(null);
		panel.add(statusbar,BorderLayout.PAGE_START);
		//**********//
		JButton add = new JButton("+");
		add.setBounds(40, 30, 80, 25);
		add.addActionListener(new ButtonListener1());
		add.addActionListener(new ButtonListener2());
		panel.add(add);
		//**********//
		Calendar calendar = Calendar.getInstance();
		int currentYear = calendar.get(Calendar.YEAR);
		
		SpinnerModel yearModel = new SpinnerNumberModel(currentYear,
				currentYear - 100,
				currentYear + 100,
				1);
		spinner=new JSpinner(yearModel);
		spinner.setEditor(new JSpinner.NumberEditor(spinner, "#"));
		spinner.setBounds(190, 30, 80, 25);		
		panel.add(spinner);
		//**********//
		add(panel);
		
		setSize(300, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);		
	}
	public static void main(String[] args){
		new multilistener();
	}

	class ButtonListener1 implements ActionListener {
		public void actionPerformed(ActionEvent e)
		{
		Integer val = (Integer) spinner.getValue();
		spinner.setValue(++val);
		}
	}
	class ButtonListener2 implements ActionListener {
	public void actionPerformed(ActionEvent e)
		{
		statusbar.setText(Integer.toString(++count));
		}
	}	
}
