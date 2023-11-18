package utils;
import static customExceptios.PublicationExceptions.*;
import java.time.LocalDate;
import java.util.HashMap;

import javax.swing.text.TabableView;

import com.app.core.Book;
import com.app.core.Publication;
import com.app.core.Tape;

import customExceptios.PublicationExceptions;



public class publicationUtils {
	
	public static Book validateBooks(String title, int price, String publishingDate, int rating, int pages,HashMap<Integer, Publication>bookmap) throws PublicationExceptions{
		if(bookmap.containsValue(title)) {
			throw new PublicationExceptions("Duplicate title");
			
		}
		LocalDate pubDate = LocalDate.parse(publishingDate);
		if (rating<0||rating>10) {
			throw new PublicationExceptions("Invalid rating rate between 1-10");
		}
	
		return new Book(title, price, pubDate, rating, pages);
	}
	
	
	public static Tape validateTapes(String title, int price, String publishingDate, int rating, int playingTime,HashMap<Integer, Publication>bookmap) throws PublicationExceptions{
		if(bookmap.containsValue(title)) {
			throw new PublicationExceptions("Duplicate title");
			
		}
		LocalDate pubDate1 = LocalDate.parse(publishingDate);
		if (rating<0||rating>10) {
			throw new PublicationExceptions("Invalid rating rate between 1-10");
		}
	
		return new Tape(title, price, pubDate1, rating, playingTime);
	}
	
	
	public static HashMap<Integer, Publication> populatePublication() {
		HashMap<Integer, Publication> publications = new HashMap<>();
		Book b1 =new Book("Ikigai", 500, LocalDate.parse("2013-05-06"), 8, 350);
		Book b2 =new Book("CTBD", 450, LocalDate.parse("2023-04-06"), 6, 250);
		Book b3 =new Book("Harry potter", 480, LocalDate.parse("1998-05-06"), 7, 400);
		Tape t1 = new Tape("ts", 500, LocalDate.parse("2019-05-06"), 8, 120);
		Tape t2 = new Tape("rm", 200, LocalDate.parse("2022-05-06"), 6, 190);
		Tape t3 = new Tape("vm", 350, LocalDate.parse("2021-05-06"), 6, 250);
		publications.put(b1.getId(), b1);
		publications.put(b2.getId(), b2);
		publications.put(b3.getId(), b3);
		publications.put(t1.getId(), t1);
		publications.put(t2.getId(), t2);
		publications.put(t3.getId(), t3);
		return publications;
	}

}
