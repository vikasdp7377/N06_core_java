package org.tns.decision;
import java.util.Scanner;
public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age And Weight : ");
		int age = sc.nextInt();
		int weight = sc.nextInt();
		if(age > 18 && weight >= 45)
		{
			System.out.println("Eligible to donate the Blood.....!!!");
		}
		else
		{
			System.out.println("not consider.....!!!");
		}
		
	}

}
