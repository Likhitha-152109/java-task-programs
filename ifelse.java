package task1;

import java.util.Scanner;

public class ifelse {
	public static void main(String[] args) {
		int n;
		Scanner src=new Scanner(System.in);
		System.out.println("Enter n value:");
		n=src.nextInt();
		if(n%2==0) {
			
			System.out.println("Even number");
			
		}
		else {
			System.out.println("Odd number");
		}
		src.close();
	}

}
