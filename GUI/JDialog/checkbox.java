import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class checkbox extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public checkbox(){
		
	setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
	add(Box.createRigidArea(new Dimension(150,20)));
	
	JCheckBox checkbox = new JCheckBox("Show Title", true);
	
	checkbox.setFocusable(false);
	checkbox.addActionListener(this);
	add(checkbox);
	
	setSize(280, 200);
	setTitle("CheckBox example");
	setLocationRelativeTo(null);
	setResizable(false);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		if (this.getTitle() == "") {
		this.setTitle("Checkbox example");
		} else {
		this.setTitle("");
		}
	}
	
	public static void main(String[] args){
		new checkbox();
	}
	
	

}
