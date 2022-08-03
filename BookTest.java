
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;


public class BookTest {
	public static void main(String[] args) {
		/*
		Books book1 = new Books("Introduction to Java", 1534, 3, 543,799);
		Books book2 = new Books("Atomic Habits", 264, 2, 278, 350);
		Books book3 = new Books("the Subtle art of not giving a fu*k", 23,1,261,899);
		
		System.out.println("book1 : "+book1);
		System.out.println("book2 : "+book2);
		System.out.println("book3 : "+book3);
		
		System.out.println("================================");
		System.out.println("book1 : "+book1.hashCode());
		System.out.println("book2 : "+book2.hashCode());
		System.out.println("book3 : "+book3.hashCode());
		System.out.println("================================");
		
		
	
		HashSet<Books> bookShelf = new HashSet<Books>();
		
		System.out.println("Adding the 1st Book");
		bookShelf.add(book1);

		System.out.println("Adding the 2nd Book");
		bookShelf.add(book2);
		
		System.out.println("Adding the 3rd Book");
		bookShelf.add(book3);
	
		for (Books book : bookShelf) {
			System.out.println("The Book : "+book);
		}
		try {
			System.out.println("File is Ready to serialize ");
			FileOutputStream fout = new FileOutputStream("C:\\Java Training\\TrainingTest\\bankdetails.dat");
			System.out.println("Object stream is ready....");
			ObjectOutputStream oos = new ObjectOutputStream(fout);
			System.out.println("Trying to store the object...");
			oos.writeObject(bookShelf);
			oos.close();
			fout.close();
			System.out.println("File is Serialized and Encrypted....");
		}
		catch(FileNotFoundException exp) {
			System.out.println(exp);
		}*/
		
		Books ba = null;
		System.out.println("Object is null...");
		
		try {
			FileInputStream fin  = new FileInputStream("C:\\\\Java Training\\\\TrainingTest\\\\bankdetails.dat");
			System.out.println("File is ready..for reading.....");
			
			ObjectInputStream ois = new ObjectInputStream(fin);
			System.out.println("Object stream is ready...for reading object.");
			
			System.out.println("Trying to retrieve the object...");
			ba = (Books) ois.readObject();
			System.out.println("Object retrieved....");
			
			System.out.println("ba is : "+ba);
			
			ois.close();
			fin.close();
	
	}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}


class Books implements Serializable
{
	String bookTitle;
	int bookNumber;
	int bookEdition;
	int totalPages;
	int bookPrice;
	public Books(String bookTitle, int bookNumber, int bookEdition, int totalPages, int bookPrice) {
		super();
		this.bookTitle = bookTitle;
		this.bookNumber = bookNumber;
		this.bookEdition = bookEdition;
		this.totalPages = totalPages;
		this.bookPrice = bookPrice;
	}
	@Override
	public String toString() {
		return "Books [bookTitle=" + bookTitle + ", bookNumber=" + bookNumber + ", bookEdition=" + bookEdition
				+ ", totalPages=" + totalPages + ", bookPrice=" + bookPrice + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(bookEdition, bookNumber, bookPrice, bookTitle, totalPages);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Books other = (Books) obj;
		return bookEdition == other.bookEdition && bookNumber == other.bookNumber && bookPrice == other.bookPrice
				&& Objects.equals(bookTitle, other.bookTitle) && totalPages == other.totalPages;
	}
	
}	
	
	
}