import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToolBar;

public class colorChooser extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel panel;
	private JPanel display;
	
	public colorChooser(){
		
		setTitle("ColorChooserDialog");
		
		panel=new JPanel();
		panel.setLayout(new BorderLayout());
		
		ImageIcon open = new ImageIcon(getClass().getResource("/resources/redo.png"));
		JButton openb=new JButton(open);	
		openb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
			JColorChooser clr = new JColorChooser();
			
			@SuppressWarnings("static-access")
			Color color =clr.showDialog(panel, "Choose Color",Color.white);
			display.setBackground(color);
				}
			});
		
		JToolBar toolbar=new JToolBar();
		toolbar.add(openb);
		
		display = new JPanel();
		display.setBackground(Color.BLACK);
		
		panel.setBorder(BorderFactory.createEmptyBorder(30, 50, 30, 50));
		panel.add(display);
		
		add(panel);
		add(toolbar, BorderLayout.NORTH);
		setSize(400, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);		
	}
	
	public static void main(String[] args) {
		new colorChooser();
		}
}
