import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

public class filechooser extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel panel;
	private JTextArea area;
	
	public filechooser(){
	
		setTitle("FileChooserDialog");
		
		panel=new JPanel();
		panel.setLayout(new BorderLayout());
			
		JToolBar toolbar=new JToolBar();
		
		ImageIcon open=new ImageIcon(getClass().getResource("/resources/redo.png"));
		
		JButton openb=new JButton(open);
		
		openb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				JFileChooser fileopen = new JFileChooser();			
				FileFilter filter = new FileNameExtensionFilter("c files", "c");
				fileopen.addChoosableFileFilter(filter);
				int ret = fileopen.showDialog(panel, "Open file");
				if (ret == JFileChooser.APPROVE_OPTION) {
						File file = fileopen.getSelectedFile();
						String text = readFile(file);
						area.setText(text);
					}
				}
			});
		
		toolbar.add(openb);
		area=new JTextArea();
		area.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
		
		JScrollPane pane=new JScrollPane();
		pane.getViewport().add(area);
		
		panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		panel.add(pane);
		add(panel);
		add(toolbar, BorderLayout.NORTH);
		
		setSize(400, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public String readFile (File file) {
		StringBuffer fileBuffer = null;
		String fileString = null;
		String line = null;
			try {
					FileReader in = new FileReader (file);
					BufferedReader brd = new BufferedReader (in);
					fileBuffer = new StringBuffer() ;
					while ((line = brd.readLine()) != null) {
						fileBuffer.append(line +
								System.getProperty("line.separator"));
					}
					in.close();
					fileString = fileBuffer.toString();
				}
			catch(IOException e ) {
				return null;
								   }
			return fileString;
		}
	
	public static void main(String[] args){
		new filechooser();
		
	}

}
