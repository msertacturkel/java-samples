import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;


public class AboutDialog extends JDialog{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AboutDialog() {
		
		setTitle("About Notes");
		setLayout(new BoxLayout(getContentPane(),BoxLayout.Y_AXIS));
		add(Box.createRigidArea(new Dimension(0,20)));
		
		ImageIcon icon=new ImageIcon(getClass().getResource("/resources/addressbook.png"));
		JLabel label=new JLabel(icon);
		label.setAlignmentX(0.5f);
		add(label);
		
		add(Box.createRigidArea(new Dimension(0,20)));
		
		JLabel name = new JLabel("Notes, 1.23");
		name.setFont(new Font("Serif", Font.BOLD, 13));
		name.setAlignmentX(0.5f);
		add(name);
		
		add(Box.createRigidArea(new Dimension(0, 50)));
		
		JButton close = new JButton("Close");
		close.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				dispose();
			}	
		});
		close.setAlignmentX(0.5f);
		add(close);
		
		setModalityType(ModalityType.APPLICATION_MODAL);
		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setSize(300, 200);
		}
}
