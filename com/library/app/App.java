package com.library.app;
import com.library.books.Library;
import com.library.staff.Librarian;
public class App{
	public static void main(String args[]){
		Library obj1=new Library();
		obj1.setLibraryName("Central Library of Hyderabad");
		obj1.setTotalBooks(10000);
		Librarian obj2=new Librarian();
		obj2.setLibrarianName("Chndra Shekhar");
		obj2.setYearsOfExperience(15);
		obj1.showLibraryDetails();
		System.out.println();
		obj2.showLibrarianInfo();
	}
}