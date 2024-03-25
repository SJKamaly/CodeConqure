package homayoon;

import java.util.HashMap;
import java.util.Map;

public class Practice {

	public static void main(String[] args) {
		String[] data = { "test", "take", "nice", "nice", "test", "test", "nice" };
		printDuplicate(data);

	}

	public static void printDuplicate(String[] data) {

		Map<String, Integer> temp = new HashMap<String, Integer>();
		Map<String, Integer> dup = new HashMap<String, Integer>();

		for (int i = 0; i < data.length; i++) {
			if (temp.containsKey(data[i])) {
				temp.put(data[i], temp.get(data[i]) + 1);
			} else {
				temp.put(data[i], 1);
			}
		}
		for(String key: temp.keySet()) {
			if(temp.get(key)>1) {
				dup.put(key, temp.get(key));
			}
		}
		System.out.println(dup);
		
	}

}
