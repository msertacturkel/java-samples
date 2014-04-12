package htmlsourcegetter;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;


public class HTMLKaynak {

	public static void main(String[] args) {
		try {
			URL u=new URL("http://www.google.com");
			Scanner sc=new Scanner(u.openStream());
			while(sc.hasNextLine())
				System.out.println(sc.nextLine());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}