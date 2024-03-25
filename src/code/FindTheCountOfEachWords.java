package code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindTheCountOfEachWords {

	public static void main(String[] args) {
		
		//FInd the count of each duplicate for example Apple = 5
		//Find the number of duplicates
		//find the number of duplicates
		//output: Apple = 3
		
		String input = "This is a simpale text simpale for the text is question.";
		System.out.println(hasDuplciateWord(input));
		System.out.println(countWords(input));
		

	}
	public static List<String> hasDuplciateWord(String str) {
		
		List<String> duplicateValues = new ArrayList<>();
		
		String [] words=str.split(" ");
		for(int i = 0; i<words.length;i++) {
			for(int j=i+1;j<words.length;j++) {
				if(words[i].equals(words[j])) {
					duplicateValues.add(words[i]);
				}
			}
		}
		return duplicateValues;
	}
	
	public static Map<String, Integer> countWords(String str){
		String [] words=str.split(" ");
		Map<String, Integer> duplicateWords = new HashMap<String,Integer>();
		Map<String, Integer> anotherDups= new HashMap<String,Integer>();
		//Loop through the words
		for(String word: words) {
			//check if the words exists inside of the loop 
			if(duplicateWords.containsKey(word)) {
				//if yes, increase the value of the key 
			duplicateWords.put(word, duplicateWords.get(word)+1);
		}else {
			//if not, add the word inside map with the count 1
			duplicateWords.put(word,1);
		}
			
			if(duplicateWords.get(word)!=1) {
				anotherDups.put(word, duplicateWords.get(word));
			}
		}
		
		return duplicateWords;
	}

}
