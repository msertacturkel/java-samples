package sampleChatter;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;


public class EESThreadPart extends Thread{

	private Socket socket;

	public EESThreadPart(Socket socket) {
		this.socket = socket;
	}
	
	
	public void run() {
		try {
			//client'a bilgi gondermek icin
			PrintStream pr=new PrintStream(socket.getOutputStream());
			//client'dan bilgi almak icin
			Scanner sc=new Scanner(socket.getInputStream());
			pr.println("merhaba ben server cikmak icin bye yazin..");
			while(sc.hasNextLine()){
				String gelen=sc.nextLine();
				System.out.println(socket.getInetAddress()+":"+gelen);
				if(gelen.trim().equalsIgnoreCase("bye")) break;
				pr.println("Echo:"+gelen);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
