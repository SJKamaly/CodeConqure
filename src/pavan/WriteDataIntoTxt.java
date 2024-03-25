package pavan;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoTxt {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter(".\\Data\\newTxt.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Selenium Java \t");
		bw.write("Post RestAssured \t");
		bw.write("Python and Kothlin \t");
		
		System.out.println("All done!");
		bw.close();
		
		

	}
	

}
