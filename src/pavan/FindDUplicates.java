package pavan;

import java.util.HashSet;
import java.util.Set;

public class FindDUplicates {
	public static void main(String[] args) {
		
		String [] str = {"C", "C++", "Java", "Python","Java"};

		findDuplicate(str);
		
		
	}

	public static void findDuplicate(String str[]) {
		boolean flag = false;
		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {
				if (str[i] == str[j]) {
					System.out.println("Duplicate element found: " + str[i]);
					flag = true;
				}
			}
		}
		if (flag == false) {
			System.out.println("No duplicate element found");
		}
	}

}


