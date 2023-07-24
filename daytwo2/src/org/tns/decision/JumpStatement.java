package org.tns.decision;

import java.util.Scanner;

public class JumpStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age And Weight : ");
		int age = sc.nextInt();
		int weight = sc.nextInt();
		if(age >= 12)
		{
			if(weight>=40)
			{
				System.out.println("Eligible for Bunjee jumping.....!!!");
				if(weight>=100)
				{
					System.out.println("Extra ropes will bw added....!!!");
				}
			}
			else
			{
				System.out.println("Not Eligible...!!!");
			}
		}
		else
		{
			System.out.println("You are not Eligible!!!");
		}
	}

}
