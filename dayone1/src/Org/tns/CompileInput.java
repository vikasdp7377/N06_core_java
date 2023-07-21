package Org.tns;
import java.util.Scanner;
public class CompileInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("Enter two Numbers : ");
	    System.out.println("Addition = "+ (num1+num2));
	    System.out.println("Sub = " + (num1-num2));
	    System.out.println("Division = "+ (num1/num2));

	}

}
