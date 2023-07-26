package Operator;
import java.util.Scanner;
public class TernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("entert number : ");
		int num1 = sc.nextInt();
		
		String result = (num1%2==0)?"Given No. is Even":"Given No. is Odd";
		System.out.println(result);

	}

}
