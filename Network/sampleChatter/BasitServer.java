package sampleChatter;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;


public class BasitServer {

	public static void main(String[] args) {
		
		try {
			ServerSocket ss=new ServerSocket(23);
			System.out.println(InetAddress.getLocalHost()+" hazir..");
			Socket s = ss.accept();
			System.out.println(s.getInetAddress()+"  baglandi..");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}