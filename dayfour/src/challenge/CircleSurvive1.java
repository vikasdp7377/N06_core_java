
package challenge;
import java.util.Scanner;
public class CircleSurvive1 {
	static int survive(int n,int k)
	{
		if(n==1)
			return 1;
		else
			return(survive(n-1,k)+k-1)%n+1;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value for n and k : ");
		int n=sc.nextInt();
		int k=sc.nextInt();
		int s = survive(n,k);
		System.out.println(s);
				

	}

}
