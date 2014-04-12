package gonderilecek_kod;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.io.InputStreamReader;
import java.net.URL;

public class dosya_islemi {

	public static void main(String[] args) {
		new dosya_islemi();
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public dosya_islemi() {
		//JFrame 
		JFrame guiFrame = new JFrame();
		guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		guiFrame.setTitle("DOSYA İSLEMLERİ");
		guiFrame.setSize(600, 400);
		guiFrame.setLocationRelativeTo(null);
		
		//JMenuBar
		JMenuBar menuBar = new JMenuBar();
		JMenu uygulamaMenu = new JMenu("Uygulamalar");
		JMenu hakkindaMenu = new JMenu("Hakkında");
		JMenu cikisMenu = new JMenu("Cikis");
		
		menuBar.add(uygulamaMenu);
		menuBar.add(hakkindaMenu);
		menuBar.add(cikisMenu);
		
		JMenuItem newAction1 =   new JMenuItem("Uygulama1");
		JMenuItem newAction2 =   new JMenuItem("Uygulama2");
		JMenuItem newAction3 =   new JMenuItem("Uygulama3");
		JMenuItem hakkinda1 =   new JMenuItem("Kisaca");
		JMenuItem hakkinda2 =   new JMenuItem("Linkle");		
		JMenuItem cikis =   new JMenuItem("Cikis",UIManager.getIcon("OptionPane.errorIcon"));
		
		uygulamaMenu.add(newAction1);
		uygulamaMenu.add(newAction2);
		uygulamaMenu.add(newAction3);
		
		hakkindaMenu.add(hakkinda1);
		hakkindaMenu.add(hakkinda2);
		
		cikisMenu.add(cikis);
		
		//hakkinda1.addActionListener(new MenuBarItem());
		//TO DO: MenuItemlara olaylar eklenecek.		

		//JCombobox 
		String islem[] = { "Secenekler","Sayfaya Git", "Sayfayi kaydet", "Kelime ara" };

		final JPanel comboPanel = new JPanel();
		JLabel comboLabel1 = new JLabel("Dosya İşlemi Seç..");
		final JComboBox combo_islem = new JComboBox(islem);

		comboPanel.add(comboLabel1);
		comboPanel.add(combo_islem);
		
		//JFrame e bileşenlerin yerleşimi
		guiFrame.add(comboPanel, BorderLayout.CENTER);
		guiFrame.add(menuBar, BorderLayout.PAGE_START);		
		guiFrame.setVisible(true);
	
		//ComboItemlerin tetiklenisi..
		combo_islem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        JComboBox combo_islem = (JComboBox)e.getSource();
		        String islem = (String)combo_islem.getSelectedItem();
		        	
		        if (islem == "Sayfaya Git") {
		        	sayfayaGit();
		        }
		        if (islem == "Sayfayi kaydet") {
		        	boolean kontrol = sayfayiDosyayaYaz();
		        	if (kontrol) {
		        		
		        		JOptionPane.showMessageDialog(null,"Dosya Başarıyla kaydedildi");
		        	} else {
		        		JOptionPane.showMessageDialog(null,"Dosya kaydedilemedi.");
		        	}
		        }
		        if (islem == "Kelime ara") {
		        	sayfadaAra();
		        }
			}
		});
	}

	
	public void sayfayaGit() {
		String urlGit = JOptionPane.showInputDialog("(http://www.google.com)URL girin: ");

		try {
			java.awt.Desktop.getDesktop().browse(java.net.URI.create(urlGit));
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public void sayfadaAra() {
		String anahtarKelime = JOptionPane
				.showInputDialog("Aranacak kelimeyi girin: ");
		try {
			String path;
			path = new File(".").getCanonicalPath()
					+ "/src/indirilensayfa.html";

			BufferedReader br = null;
			String sCurrentLine;
			br = new BufferedReader(new FileReader(path));
			int sayac = 0;
			while ((sCurrentLine = br.readLine()) != null) {
				if (sCurrentLine.contains(anahtarKelime)) {
					JOptionPane.showMessageDialog(null,
							"Aradığınız Kelime sayfada mevcut");
					sayac++;
				}
			}
			if (sayac == 0)
				JOptionPane.showMessageDialog(null,
						"Aradığiniz kelime bulunmamakta");
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public boolean sayfayiDosyayaYaz() {
		try {

			String urlGit = JOptionPane.showInputDialog("URL girin: ");

			URL myUrl = new URL(urlGit);
			BufferedReader in = new BufferedReader(new InputStreamReader(
					myUrl.openStream()));

			String line;
			String path = new File(".").getCanonicalPath()
					+ "/src/indirilensayfa.html";

			BufferedWriter out = new BufferedWriter(new FileWriter(path));

			while ((line = in.readLine()) != null) {
				out.write(line);
			}

			in.close();
			out.close();
			return true;

		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}

	}

}
