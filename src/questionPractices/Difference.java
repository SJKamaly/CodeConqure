package questionPractices;

public class Difference {

	public static void main(String[] args) {
		
		display();//calling without object creation 
		Difference t = new Difference();
		t.show();//calling with objects

	}
	static void display() {
		System.out.println("Programming is amazing");
	}
	void show() {
		System.out.println("Java is amazing");
	}

}
