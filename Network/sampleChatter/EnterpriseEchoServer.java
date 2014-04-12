package sampleChatter;
import java.io.IOException;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EnterpriseEchoServer {

	public static void main(String[] args) {

		try {
			ServerSocket ss = new ServerSocket(23);
			System.out.println(InetAddress.getLocalHost() + " hazir..");
			while (true) {
				Socket s = ss.accept();// client'in baglanmasi bekleniyor
				System.out.println(s.getInetAddress() + "  baglandi..");
				EESThreadPart eep = new EESThreadPart(s);
				eep.start();// thread baslatildi
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
