package task1;

import java.util.Scanner;

public class nestedif {
	public static void main(String[] args) {
		
	
		Scanner src=new Scanner(System.in);
		System.out.println("BEAUTY COMPETITION");
		System.out.println("Enter age :");
		int age=src.nextInt();
		System.out.println("Enter gender :");
		String gender=src.next();
		if(age>=18 && age<=25) {
			if(gender.equals("female")) {
				System.out.println("She can participate");
			}
			else {
				System.out.println("Not eligible for the competition");
			}
			
		}
		else {
			System.out.println("Age is not matchable to the required age");
		}
		src.close();
		
	}

}
