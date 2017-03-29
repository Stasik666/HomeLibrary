package by.homeLibrary.domain;



public class Book {
	private String title;
	private String author;
	private String pubDate;
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPubDate() {
		return pubDate;
	}

	public void setPubDate(String pubDate) {
		this.pubDate = pubDate;
	}

	
	
	public Book(String title,String author,String pubDate){
		this.title = title;
		this.author = author;
		this.pubDate = pubDate;
	}
}
