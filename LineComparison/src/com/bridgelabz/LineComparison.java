package com.bridgelabz;
import java.util.Scanner;
public class LineComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Line Comparsion Computation Program");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter X1 & Y1 co-ordinates");
		int X1 = sc.nextInt();
		int Y1 = sc.nextInt();
		System.out.println("Enter X2 & Y2 co-ordinates");
		int X2 = sc.nextInt();
		int Y2 = sc.nextInt();
		//calculate the length
		double len = Math.sqrt((X2-X1)*(X2-X1)+(Y2-Y1)*(Y2-Y1));
		System.out.println("Length of line : " +len);

	}

}
