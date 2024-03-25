package pavan;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Practice1 {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader(System.getProperty("user.dir")+"\\data\\myfile.txt");
		BufferedReader br = new BufferedReader(fr);
		String str;
		while((str=br.readLine())!=null) {
			System.out.println(str);
			
		}

	}

}
