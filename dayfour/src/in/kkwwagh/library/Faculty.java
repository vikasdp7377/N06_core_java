//program to demonstrate on access specifiers
//driver class
package in.kkwwagh.library;
import in.bkcmet.library.Library;

public class Faculty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library l = new Library();
		l.libraryName = "Bhujbal Library";
		l.displayPublic();
		
		/* userId and displayPrivate() method is private, so
		 * we can't access into another package or class,only
		 * we can access inside the same class 
		 */
		
		//l.userId=123456;
		//l.displayPrivate
		
		
		
		/* booksName and displayDefault() method is default,
		 * we can't access into another package,only we can access
		 * it eithin the same package
		 */
		
		//l.booksName;
		//l.displyaDefault;
	}

}
