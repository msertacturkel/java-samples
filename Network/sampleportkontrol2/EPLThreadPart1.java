package sampleportkontrol2;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;


public class EPLThreadPart1 implements Runnable {

	private String host;
	private int port;
	public EPLThreadPart1(String host, int port) {
		this.host=host;
		this.port=port;
	}

	
	public void run() {
		try {
			Socket s=new Socket(host,port);
			System.out.println(port+" acik");
		} catch (UnknownHostException e) {
			
		} catch (IOException e) {
			
		}
	}
	
}