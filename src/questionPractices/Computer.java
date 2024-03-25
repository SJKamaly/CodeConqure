package questionPractices;

public class Computer {
	
	Computer(){
		System.out.println("Constructor of Computer class.");
	}
	void computer_method() {
		System.out.println("Power gone! Shut down your PC soon....");
	}
	public static void main(String []args) {
		Computer my = new Computer();
		Laptop lp = new Laptop();
		my.computer_method();
		lp.laptop_method();
	}
	
}
   class Laptop{
	   Laptop(){
		   System.out.println("Constractor of Laptop Computer.");
	   }
	   void laptop_method() {
		   System.out.println("99 % Battery available");
	   }
   }
