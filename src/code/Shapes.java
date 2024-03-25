package code;

public class Shapes {

	public static void main(String[] args) {
		
		//*
		//**
		//***
		//****
		//*****
		//******
		
		generateTriangle(20);
		generateReverseTriangle(20);
	}
	public static void generateTriangle(int n) {
		for (int row=1;row<=n;row++) {
			for(int col =1; col<=row;col++) {
				System.out.print("*");
			}
			System.out.println();
			
		}

	}
	
	//print the triangle in reverse
	
	public static void generateReverseTriangle(int n) {
		for (int row=n;row>=1;row--) {
			for(int col =1; col<=row;col++) {
				System.out.print("*");
			}
			System.out.println();
			
		}

	}

}
