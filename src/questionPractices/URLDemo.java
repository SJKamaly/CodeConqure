package questionPractices;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class URLDemo {

	public static void main(String[] args) throws IOException {
		
		try {
			URL url = new URL("https://www.facebook.com");
			
			System.out.println("Protocol: "+ url.getProtocol());
			System.out.println("Host Name: "+ url.getHost());
			System.out.println("Port Number: "+ url.getPort());
			System.out.println("File Name: "+ url.getFile());
			System.out.println("Authority: "+ url.getAuthority());
			System.out.println("Content: "+ url.getContent());
			System.out.println("User Info: "+ url.getUserInfo());
			System.out.println(url.getQuery());
			System.out.println(url.hashCode());
			
			
		} catch (MalformedURLException e) {
			
			System.out.println(e);
		}

	}

}
