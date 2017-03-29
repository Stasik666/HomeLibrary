package by.homeLibrary.launch;

import javax.swing.JFrame;

import by.homeLibrary.domain.*;

public class Main {
	public static void main(String[] args){		
		HomeLibrary lib = new HomeLibrary();
		Menu me = new Menu(lib.getList());
	    me.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    me.setVisible(true);
	        
		lib.addBook(new Book("War and piece","L.Tolstoy","12.05.2010"));
		lib.addBook(new Book("War and piece","N.Gogol","12.05.2011"));
		lib.addBook(new Book("War and piece","A.Pushkin","12.05.2006"));
		lib.addBook(new Book("War and piece","M.Lermontov","12.05.2001"));
		lib.addBook(new Book("War and piece","M.Gorky","12.05.2012"));
		lib.addBook(new Book("War and piece","F.Turgenev","12.05.2017"));
		
		
	} 
}
