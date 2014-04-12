package events;
import java.awt.Font;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



//public  class movingWindow extends JFrame implements ComponentListener{
public  class movingWindow extends JFrame	{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JLabel labelx;
	private JLabel labely;
	
	public movingWindow(){
		setTitle("moving window");
		JPanel panel=new JPanel();
		panel.setLayout(null);
		
		labelx=new JLabel("x: ");
		labelx.setFont(new Font("Serif", Font.BOLD, 14));
		labelx.setBounds(20, 20, 60, 25);
		panel.add(labelx);
		labely = new JLabel("y: ");
		labely.setFont(new Font("Serif", Font.BOLD, 14));
		labely.setBounds(20, 45, 60, 25);		
		panel.add(labely);
		
		add(panel);
		addComponentListener(new MoveAdapter());
		setSize(310, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);		
		
	}
	
	/*public void componentMoved(ComponentEvent e) {
		int x = e.getComponent().getX();
		int y = e.getComponent().getY();
		labelx.setText("x: " + x);
		labely.setText("y: " + y);
		}
		public void componentShown(ComponentEvent e) {}
		public void componentHidden(ComponentEvent e) {}
		
	public static void main(String[] args){
		 new movingWindow();
	}
	@Override
	public void componentResized(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}*/
	class MoveAdapter extends ComponentAdapter {
		public void componentMoved(ComponentEvent e) {
		int x = e.getComponent().getX();
		int y = e.getComponent().getY();
		labelx.setText("x: " + x);	
		labely.setText("y: " + y);
			}
		}
	
	public static void main(String[] args){
		 new movingWindow();
	}
}
