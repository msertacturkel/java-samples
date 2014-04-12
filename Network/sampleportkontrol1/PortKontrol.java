package sampleportkontrol1;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class PortKontrol {

	public static void main(String[] args) {
		for (int port = 79; port <= 100; port++) {
			System.out.println(port);
			try {
				Socket s = new Socket("www.google.com", port);
				System.out.println("port acik");
			} catch (UnknownHostException e) {

			} catch (IOException e) {
			}
		}

	}

}
