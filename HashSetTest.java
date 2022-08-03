//import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;

public class HashSetTest {
	public static void main(String[] args) {
		Book book1 = new Book("Java8");
		Book book2 = new Book("Java9");
		Book book3 = new Book("java8");
		
		System.out.println("book1 : "+book1);
		System.out.println("book2 : "+book2);
		System.out.println("book3 : "+book3);
		
		System.out.println("================================");
		System.out.println("book1 : "+book1.hashCode());
		System.out.println("book2 : "+book2.hashCode());
		System.out.println("book3 : "+book3.hashCode());
		System.out.println("================================");
		
		
	
		HashSet<Book> bookShelf = new HashSet<Book>();
		
		System.out.println("Adding the 1st Book");
		bookShelf.add(book1);

		System.out.println("Adding the 2nd Book");
		bookShelf.add(book2);
		
		System.out.println("Adding the 3rd Book");
		bookShelf.add(book3);
	
		for (Book book : bookShelf) {
			System.out.println("The Book : "+book);
		}
	
	}
}
class Book 
{
	String title;

	public Book(String title) {
		super();
		this.title = title;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(title, other.title);
	}
	
	
	
	
}
