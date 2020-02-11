
import java.util.*;
import java.util.Iterator;

/**
 * Represents the inventory of books in one bookstore
 */
public class Bookstore
{
    private final String aName; // Unique
    private final HashMap<Book, Integer> aInventory = new HashMap<>();
    private int itemNumber = 0;

    /**
     * Creates a new bookstore with no books in it,
     * and identified uniquely with pName.
     * @param pName A unique identifier for the bookstore.
     */
    public Bookstore(String pName)
    {
        aName = pName;
    }

    /**
     * @return The unique name of the bookstore.
     */
    public String getName()
    {
        return aName;
    }


    //Lab 1
    public void addBook(Book aBook){
        Book passThrough = new Book(aBook.getTitle(), aBook.getAuthor(), aBook.getType(), aBook.getPrice());
        aInventory.put(passThrough, itemNumber);
        itemNumber++;
    }

    //Lab 1
    public void sortByPrice(Comparator<Book> pComparator){
        ArrayList<Book> valueList = new ArrayList<Book>(aInventory.keySet());
        Collections.sort(valueList);
        for (Book aBook: valueList) {
            System.out.println(aBook.toString());
        }
    }


    //Lab 1
    public void addListBooks(List<Book> someBooks){
        for (Book aBook : someBooks) {
            Book temp = new Book(aBook.getTitle(), aBook.getAuthor(), aBook.getType(), aBook.getPrice());
            aInventory.put(temp, itemNumber);
            itemNumber++;
        }
    }

    //Lab 1
    //we could also set up a global attribute which is updated every time we add a new book
    //by definition it would store the last book added
    public Book returnLastBook(){
        Iterator iter = (Iterator) aInventory.entrySet();
        Book capturedBook = new Book("temp","temp",BookType.OTHER, 0);
        while(iter.hasNext()){
            Map.Entry element = (Map.Entry)iter.next();
            capturedBook = (Book)element.getKey();
        }
        Book temp = new Book(capturedBook.getTitle(), capturedBook.getAuthor(), capturedBook.getType(), capturedBook.getPrice());
        return temp;
    }

}