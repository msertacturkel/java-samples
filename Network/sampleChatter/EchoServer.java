package sampleChatter;
import java.io.IOException;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchoServer {

	public static void main(String[] args) {

		try {
			ServerSocket ss = new ServerSocket(23);
			System.out.println(InetAddress.getLocalHost() + " hazir..");
			Socket s = ss.accept();// client'in baglanmasi bekleniyor
			System.out.println(s.getInetAddress() + "  baglandi..");
			PrintStream pr = new PrintStream(s.getOutputStream());
			pr.println("merhaba ben server");
			pr.println("cikmak icin bye yaziniz");
			Scanner sc = new Scanner(s.getInputStream());
			while (sc.hasNextLine()) {
				String gelen = sc.nextLine();// client'dan gelen
				System.out.println("client->" + gelen);
				if (gelen.trim().equalsIgnoreCase("bye"))
					break;
				pr.println("Echo:" + gelen); // client'a gonderdik
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
