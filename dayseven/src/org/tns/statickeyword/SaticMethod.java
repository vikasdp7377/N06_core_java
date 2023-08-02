package org.tns.statickeyword;

public class SaticMethod {
	/*
	 * if any method declared outside main function.if you want to access method then static is used.
	 */
	String str="BKC";
	static float  perce =78.2f;
	static void displayScore(int score)
	{
		//System.out.println(str);    we can't used non static variable inside 
		System.out.println("Percentage is : "+score);
		System.out.println("Score is : "+score);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		displayScore(56);
		

	}

}
