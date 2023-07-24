package Arithmetic;
import java.util.Scanner;
public class RelationalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int y;
		do
		{
		System.out.println("Enter value of A & B : ");
		int A=sc.nextInt();
		int B=sc.nextInt();
		System.out.println(" A = "+A);
		System.out.println(" B = "+B);
		if(A>B)
		{
			System.out.println("A is greater than B");
		}
		else
		{
			System.out.println("B is greater than A");
		}
		System.out.println("Do you want to Continue please enter 1 :");
		y=sc.nextInt();
		if(y!=1)
		{
			System.out.println("thank you.......!!!");
		}
		}
		while(y==1);
	}

}
