package questionPractices;

public interface Info {
	
	static final String language = "Java";
	public void display();
	
}
   class Simple implements Info{
	   public static void main (String []args) {
		   
		   Simple obj = new Simple();
		   obj.display();
		   
	   }

	@Override
	public void display() {
		System.out.println(language + " is awewome");
		
	
	   }
	   
	   
   }
