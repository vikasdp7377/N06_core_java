package org.tnsif.polymorphisam;
class ChiefMinister
{
	static void corruption(String str1, float amount2)
	{
		System.out.println(str1+" corrupted the ammount of "+amount2 );
	}
}
class MLA extends ChiefMinister
{
	static void corruption(String str2, float amount2)
	{
		ChiefMinister.corruption("Eknath Shinde",45646.90f);
		System.out.println(str2+" corrupted the ammount of "+amount2 );
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MLA.corruption("Banwarilal purohit",234534.23f);

	}

}
