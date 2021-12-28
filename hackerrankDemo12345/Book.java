package hackerrankDemo12345;

public class Book implements Comparable<Book>{
	private String bookName;
	private int page;
    private String authorName;
    private String date;
    
    
    
	public Book(String bookName, int page, String authorName, String date) {
		super();
		this.bookName = bookName;
		this.page = page;
		this.authorName = authorName;
		this.date = date;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public int compareTo(Book o) {
		
		return this.getBookName().compareTo(o.getBookName());
	}

}
