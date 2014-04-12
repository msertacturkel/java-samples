
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextPane;
import javax.swing.border.EtchedBorder;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Position;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyWord extends JFrame {

	private JPanel contentPane;
	private JTextPane ekran;
	private Document doc;

	public MyWord() {
		initcomponents();
		doc = ekran.getDocument();
	}

	private void btnDegistirActionPerfomed(ActionEvent e) {
		SimpleAttributeSet red = new SimpleAttributeSet();
		StyleConstants.setForeground(red, Color.RED);
		StyleConstants.setItalic(red, true);
		String text = ekran.getSelectedText();
		int ilk = ekran.getSelectionStart();		

		try {
			doc.remove(ilk, text.length());
			doc.insertString(ilk, text, red);
		} catch (BadLocationException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

	}

	/**
	 * Create the frame.
	 */
	private void initcomponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		ekran = new JTextPane();

		ekran.setText("deneme");
		ekran.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));

		JButton btnDegistir = new JButton("degistir");
		btnDegistir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnDegistirActionPerfomed(e);
			}

		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane
				.setHorizontalGroup(gl_contentPane
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								gl_contentPane
										.createSequentialGroup()
										.addGap(23)
										.addGroup(
												gl_contentPane
														.createParallelGroup(
																Alignment.LEADING)
														.addComponent(
																btnDegistir)
														.addComponent(
																ekran,
																GroupLayout.PREFERRED_SIZE,
																212,
																GroupLayout.PREFERRED_SIZE))
										.addContainerGap(189, Short.MAX_VALUE)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(
				Alignment.LEADING).addGroup(
				gl_contentPane
						.createSequentialGroup()
						.addGap(21)
						.addComponent(ekran, GroupLayout.PREFERRED_SIZE, 113,
								GroupLayout.PREFERRED_SIZE).addGap(32)
						.addComponent(btnDegistir)
						.addContainerGap(63, Short.MAX_VALUE)));
		contentPane.setLayout(gl_contentPane);
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyWord frame = new MyWord();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
