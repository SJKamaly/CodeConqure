package questionPractices;

public class IndexOfExample {

	public static void main(String[] args) {
		
		String s1 = "This an example of index";
		
		int index1 = s1.indexOf("an");
		int index2 = s1.indexOf("index");
		
		System.out.println(index1+"\t"+ index2);
		
		int index3 = s1.indexOf("example",4);
		System.out.println(index3);

	}

}
