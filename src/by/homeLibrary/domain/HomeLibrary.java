package by.homeLibrary.domain;

import java.util.ArrayList;


public class HomeLibrary {
	private ArrayList<Book> list;

	
	public HomeLibrary(){
		list = new ArrayList<Book>();
	}
	
	public ArrayList<Book> getList(){
		return list;
	}
	
	public void addBook(Book e){
		list.add(e);
	}
	public void removeBook(String s ){
		for(int i = 0; i<list.size();i++ ){
			if(list.get(i).getTitle().equals(s)){
				list.remove(i);
				i--;
			}
		}
	}
	public void searchBook(String s){
		for (Book book : list) {
			if(book.getAuthor().equals(s))
				System.out.println("Title: " + book.getTitle() + " Author: "+ book.getAuthor() + " pubDate: " + book.getPubDate());
		}
	}
	public void searchBook(String s,String r){
		for (Book book : list) {
			if(book.getAuthor().equals(s)||book.getAuthor().equals(r))
				System.out.println("Title: " + book.getTitle() + " Author: "+ book.getAuthor() + " pubDate: " + book.getPubDate());
		}
	}
}
