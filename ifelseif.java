package task1;

import java.util.Scanner;

public class ifelseif {
	public static void main(String[] args) {
		
		Scanner src=new Scanner(System.in);
		System.out.println("Enter length:");
		double length=src.nextDouble();
		if(length>=20 && length<=30)
		{
			System.out.println("S size");
		}
		else if(length>=31 && length<=40) {
			System.out.println("L size");
		}
		else if(length>=41 && length<=50) {
			System.out.println("XL size");
		}
		else if(length>=51 && length<=60) {
			System.out.println("XXL size");
		}
		else if(length>=61 && length<=70) {
			System.out.println("XXXL size");
		}
		else {
			System.out.println("No size is available");
		}
		src.close();
	
		
	}

}
