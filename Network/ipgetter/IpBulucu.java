package ipgetter;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class IpBulucu {

	public static void main(String[] args) {
		try {
			//InetAddress inet = InetAddress.getByName("www.asd.com");
			//System.out.println(inet);
			/*InetAddress[] inet = InetAddress.getAllByName("www.google.com");
			for (int i = 0; i < inet.length; i++) {
				System.out.println(inet[i]);
			}*/
			System.out.println(InetAddress.getLocalHost());
		} catch (UnknownHostException e) {
			System.out.println("adres bulunmadi");
		}

	}

}