package by.homeLibrary.domain;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class Menu extends JFrame{

	 public Menu(ArrayList<Book> list) {

	        setTitle("Menu Library");
	        setSize(300, 300);
	        JMenuBar menuBar = new JMenuBar();
	        setJMenuBar(menuBar);
	        
	        JMenu fileMenu = new JMenu("File");
	        JMenu editMenu = new JMenu("Edit");
	        Button button = new Button("Оk");
	        JFrame frame = new JFrame("InputDialog");
	        
	        menuBar.add(fileMenu);
	        menuBar.add(editMenu);
	        
	        
	        JMenuItem show = new JMenuItem("Show library");
	        show.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent arg0) {
	            	for (int i = 0;i<list.size();i++){
	        			System.out.println(i+1+")"+ "Title: " + list.get(i).getTitle() + " Author: "+ list.get(i).getAuthor() + " pubDate: " + list.get(i).getPubDate());
	        		}
	            }
	        });
	        
	        JMenuItem exit = new JMenuItem("Exit");
	        exit.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent event) {
	        System.exit(0);
	        }
	        });
	        
	        JMenuItem sort = new JMenuItem("Sort List");
	        sort.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent event) {
	 
	        		Book t;
	        		int max;
	        		for(int i = 0;i<list.size();i++){
	        			max = i;
	        			for(int j = i+1;j<list.size();j++){
	        				if(list.get(j).getPubDate().compareTo(list.get(max).getPubDate())<0)
	        					max = j; 
	        			}
	        			t = list.get(i);
	        			list.set(i, list.get(max));
	        			list.set(max, t);
	        		}
	        		
	        		JOptionPane.showMessageDialog(button, "The list have been sorted by date","Information",JOptionPane.WARNING_MESSAGE);
	        	}
	        });
	       
	        JMenuItem search = new JMenuItem("Search author");
	        search.addActionListener(new ActionListener(){
	        	public void actionPerformed(ActionEvent event) {
	        		
	        		String s = JOptionPane.showInputDialog(frame,"Введите автора");
	        		int i=0;
	        			for (Book book : list) {
	        				if(book.getAuthor().equals(s)){
	        					System.out.println("Title: " + book.getTitle() + " Author: "+ book.getAuthor() + " pubDate: " + book.getPubDate());
	        					i++;
	        				}
	        			}
	        		if(i==0)
	        			JOptionPane.showMessageDialog(button, "The book was not found","Information",JOptionPane.WARNING_MESSAGE);
	        		else
	        			i = 0;
	        	}
	        });

	        fileMenu.add(show);	  
	        fileMenu.addSeparator();
	        fileMenu.add(exit);
	        editMenu.add(sort);	        
	        editMenu.addSeparator();	        
	        editMenu.add(search);
	        
	       
	 }
}
