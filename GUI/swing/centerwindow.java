package swing;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class centerwindow extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public centerwindow(){
		createGui();
		
	}
	public void createGui(){
		setSize(300,400);
		setTitle("Ortali pencere");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Toolkit toolkit = getToolkit();
		Dimension size=toolkit.getScreenSize();
		setLocation(size.width/2 - getWidth()/2,size.height/2 - getHeight()/2);
	}
	public static void main(String[] args){
		centerwindow a=new centerwindow();
		a.setVisible(true);
		
	}
	
}

