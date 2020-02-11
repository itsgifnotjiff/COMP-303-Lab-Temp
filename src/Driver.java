import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

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

        //to print the sorted list of book in a bookstore
        //needs
        bookstore1.addListBooks(Arrays.asList(Books));
        bookstore1.sortByPrice(new Comparator<Book>() {
            public int compare(Book o1, Book o2) {
                return o1.getPrice() - o2.getPrice();
            }
        });

    }
}