package org.tnsif.polymorphisam;

class Bollywood{
	
	
	static String showcouple(String str1,String str2)
	{
		return str1+" loves "+str2;
	}
	static String showcouple(String str1,String str2, String str3)
	{
		return str1+" loves "+str2+" as well as "+str3;
	}
}
public class MethodOverloadiing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Bollywood.showcouple("salman", "Aishwarya"));
		System.out.println(Bollywood.showcouple("salman", "Aishwarya","Abhishek"));
	}

}
