package com.bridgelabz;
import java.util.Scanner;
public class LineComparison {

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparsion Computation Program");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter X1 & Y1 co-ordinates");
		int X1 = sc.nextInt();
		int Y1 = sc.nextInt();
		System.out.println("Enter X2 & Y2 co-ordinates");
		int X2 = sc.nextInt();
		int Y2 = sc.nextInt();
		//calculate the length1
		double len1 = Math.sqrt((X2-X1)*(X2-X1)+(Y2-Y1)*(Y2-Y1));
		
		System.out.println("Enter X3 & Y3 co-ordinates");
		int X3 = sc.nextInt();
		int Y3 = sc.nextInt();
		System.out.println("Enter X4 & Y4 co-ordinates");
		int X4 = sc.nextInt();
		int Y4 = sc.nextInt();
		//calculate the length2
		double len2 = Math.sqrt((X2-X1)*(X2-X1)+(Y2-Y1)*(Y2-Y1));
		
		System.out.println("Length1 of line : " +len1);
		System.out.println("Length2 of line : " +len2);
	
        
		if(len1 == len2)
			
			System.out.println("Length1 is equal to Length2");
		
		else if(len1 > len2 )
		
			System.out.println("Length1 is greater than Length2");
		
		else
			
			System.out.println("Length1 is less than length2");

	}

}
