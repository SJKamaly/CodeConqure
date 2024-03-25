package pavan;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadData {

	public static void main(String[] args) throws IOException {
		
		/*FileReader fr = new FileReader(System.getProperty("user.dir")+"\\data\\myfile.txt");
		BufferedReader br = new BufferedReader(fr);
		String str;
		while((str=br.readLine())!=null) {
			System.out.println(str);
			
		}*/
		
		/*File fi = new File(System.getProperty("user.dir")+"\\data\\myfile.txt");
		Scanner sc = new Scanner(fi);
		
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
			
		}*/
		File fi = new File(System.getProperty("user.dir")+"\\data\\myfile.txt");
		Scanner sc = new Scanner(fi);
		sc.useDelimiter("\\z");
		System.out.println(sc.next());
	
	}

}
