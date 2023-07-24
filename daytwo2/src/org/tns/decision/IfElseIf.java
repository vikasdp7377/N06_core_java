package org.tns.decision;

import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 persons Age : ");
		int age1 = sc.nextInt();
		int age2 = sc.nextInt();
		int age3 = sc.nextInt();
		if(age1 > age2 && age1> age3)
			
		{
			System.out.println("Age one is greater...!");
			
		}
		else if (age2>age3)
		{
			System.out.println("age two is greater");
		}
		else
		{
			System.out.println("age three is greater");
		}
	}

}
