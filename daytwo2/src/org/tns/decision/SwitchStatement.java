package org.tns.decision;
import java.util.Scanner;
public class SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int ch;
		do
		{
		System.out.println("Enter song ");
		int songno = s.nextInt();
		switch(songno)
		{
		case 1:
			System.out.println("waka waka ");
			break;
		case 2:
			System.out.println("taki taki ");
			break;
		case 3:
			System.out.println("Jay shree Ram ");
			break;
		default :
			System.out.println("you enter invalid choice");
		}
		System.out.println("do you want to continue press (1) : ");
		ch = s.nextInt();
	}
	while(ch==1);
	}

}
