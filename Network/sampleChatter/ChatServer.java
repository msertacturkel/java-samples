package sampleChatter;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class ChatServer extends JFrame implements Runnable {
	private JTextArea ekranTA;
	private JTextField girisTF;
	private PrintStream pr;
	private Scanner sc;

	public ChatServer() {
		this.setVisible(true);
		this.setBounds(100, 100, 300, 300);
		initComponents();
		serveriBaslat();
		// Thread baslat
		Thread t = new Thread(this); // kendi sinifimizdaki Thread
		t.start();// thread baslatildi
	}

	private void serveriBaslat() {
		try {
			ServerSocket ss = new ServerSocket(300);
			ekranTA.setText(InetAddress.getLocalHost() + "hazir..\n");
			// Client bekleniyor
			Socket socket = ss.accept();
			// client'a gondermek icin
			pr = new PrintStream(socket.getOutputStream());
			// client'i dinlemek icin
			sc = new Scanner(socket.getInputStream());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void run() {
		while (sc.hasNextLine()) {
			String clientdanGelen = sc.nextLine();
			ekranTA.append("Client:" + clientdanGelen + "\n");
		}

	}

	private void initComponents() {
		setTitle("Chat Server V 1.0");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		Container con = getContentPane();// container
		setLayout(new BorderLayout());
		ekranTA = new JTextArea();
		girisTF = new JTextField();
		girisTF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				girisTFActionPerformed(e);
			}

		});
		ekranTA.setEditable(false);
		con.add(ekranTA, BorderLayout.CENTER);
		con.add(girisTF, BorderLayout.SOUTH);

	}

	private void girisTFActionPerformed(ActionEvent e) {
		// TextField'a enter'e basildiginda
		String gelen = girisTF.getText();
		ekranTA.append("Server:" + gelen + "\n");
		girisTF.setText("");// Textfield siliniyor
		pr.println(gelen);

	}

	public static void main(String[] args) {
		ChatServer ch = new ChatServer();
		

	}

}