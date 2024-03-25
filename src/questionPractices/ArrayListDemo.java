package questionPractices;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Donald");
		al.add("Jassy");
		al.add("Me");
		
		Iterator it =al.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
