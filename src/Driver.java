import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Iterator;

/**
 * Utility class with a driver program and some 
 * sample books, stores, and staffs.
 */
public final class Driver
{

    private static final Book BOOK1= new Book("The Time Machine", "H. G. Wells", BookType.FICTION, 500);
    private static final Book BOOK2 = new Book("Introduction to Software Design with Java", "Martin P. Robillard", BookType.TEXTBOOK, 3999);
    private static final Book BOOK3 = new Book("The Moomins and the Great Flood", "Tove Jansson", BookType.COMIC, 1695);

    private static final Book[] Books = { BOOK1, BOOK2, BOOK3 };

    private Driver() {}





    /**
     * @param pArgs Not used
     */
    public static void main(String[] pArgs)
    {
        Bookstore bookstore1 = new Bookstore("Paragraph");
        Bookstore bookstore2 = new Bookstore("The Word");
//        System.out.println(Books.length);
        for (Book i: Books)
        {
            bookstore1.updateBookToInventory(i,1);
        }

//        System.out.println("Quantity of Book 1 : " + bookstore1.quantityOfBook(BOOK1));

//        for (Book book : bookstore1.getInventory().keySet())
//        {
//            String author = book.getAuthor();
//            String name = book.getTitle();
//            System.out.println(author + " " + name);
//        }

        bookstore1.updateBookToInventory(BOOK1,3);

//        System.out.println("Quantity of Book 1 : " + bookstore1.quantityOfBook(BOOK1));

        bookstore1.sortByKeys();

        for (Book book : bookstore1.getInventory().keySet())
        {
            String author = book.getAuthor();
            String name = book.getTitle();
            System.out.println(author + " : " + name);
        }


//        Iterator it = bookstore1.getInventory().keySet().iterator();
//        System.out.println("UnSorted Map");
//        while(it.hasNext()) {
//            System.out.println(bookstore1.getInventory().get(it.next()));
//        }

    }
}