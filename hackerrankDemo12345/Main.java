package hackerrankDemo12345;

import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		TreeSet<Book> books=new TreeSet<>();
		Book x=new Book("x",20,"Ege","123457");
		Book y=new Book("y",21,"Ayse","123459");
		Book b=new Book("b",24,"Ahmet","123450");
		Book e=new Book("e",25,"Orhan","1234532");
		Book q=new Book("q",27,"Deniz","123455");
		books.add(x);
		books.add(y);
		books.add(b);
		books.add(e);
		books.add(q);
		for(Book bks:books) {
			System.out.println(bks.getBookName());
		}
		TreeSet<Book> books2=new TreeSet<>(new bookComparator());
		books2.add(x);
		books2.add(y);
		books2.add(b);
		books2.add(e);
		books2.add(q);
		
		for(Book bks2:books2) {
			System.out.println(bks2.getPage());
		}

	}

}
