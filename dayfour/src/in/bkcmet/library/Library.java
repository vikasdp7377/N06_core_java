//program to demonstrate on access specifiers
package in.bkcmet.library;

public class Library {
	public String libraryName;
	private long userId;
	String booksNmae;
	
	public void displayPublic()
	{
		System.out.println("Library Name : " + libraryName);
	}
	private void displayPrivate()
	{
		System.out.println("User Id "+ userId);
	}
	void displayDefault()
	{
		System.out.println("BookName id : "+booksNmae);
	}

}
