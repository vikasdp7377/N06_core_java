package org.tns.statickeyword;

public class SaticBlock {
	
	String str;
	static float salary;
	//static block is used to inittilize static variable and we cant initiallioze any non static variable inside the static block
	static {
		salary=346347.89f;
		//str="BKC";
	}
	static void print()
	{
		System.out.println("salary : "+salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * main function is static and hence it calls static block,method
		 * and variable by default.
		 */
		print();

	}

}
