package questionPractices;

import java.io.IOException;

public class NotePad {

	public static void main(String[] args) {
		
		Runtime rn = Runtime.getRuntime();
		
		try {
			rn.exec("notepad");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}

	}

}
