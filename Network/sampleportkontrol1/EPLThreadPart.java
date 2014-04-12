package sampleportkontrol1;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;


public class EPLThreadPart extends Thread {

	private String host;
	private int port;
	public EPLThreadPart(String host, int port) {
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