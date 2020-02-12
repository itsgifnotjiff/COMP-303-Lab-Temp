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
    //private Book lastAdded;

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

    public void addBook(Book aBook)
    {
        try
        {
            Book passThrough = new Book(aBook.getTitle(), aBook.getAuthor(), aBook.getType(), aBook.getPrice());
            aInventory.put(passThrough, itemNumber);
            itemNumber++;
        } catch (NullPointerException e)
        {
            e.printStackTrace();
        }
        //for the returnLastAdded function
        //lastAdded = passThrough;
    }

    public void removeBook(Book pBook)
    {
        aInventory.remove(pBook);
    }

    public void sortByPrice(Comparator<Book> pComparator)
    {
        ArrayList<Book> valueList = new ArrayList<Book>(aInventory.keySet());
        Collections.sort(valueList);
        for (Book aBook: valueList)
        {
            System.out.println(aBook.toString());
        }
    }

    public void addListBooks(List<Book> someBooks)
    {
        for (Book aBook : someBooks)
        {
            Book temp = new Book(aBook.getTitle(), aBook.getAuthor(), aBook.getType(), aBook.getPrice());
            aInventory.put(temp, itemNumber);
            itemNumber++;
        }
    }

    public Book returnLastBook()
    {
        Iterator bookIterator = (Iterator) aInventory.entrySet();
        Book capturedBook = new Book("temp","temp",BookType.OTHER, 0);
        while(bookIterator.hasNext())
        {
            Map.Entry element = (Map.Entry)bookIterator.next();
            capturedBook = (Book)element.getKey();
        }
        Book lastBook = new Book(capturedBook.getTitle(), capturedBook.getAuthor(), capturedBook.getType(), capturedBook.getPrice());
        return lastBook;
    }

//Alternative
//    public Book returnLastAdded(){
//        Book temp = new Book(lastAdded.getTitle(), lastAdded.getAuthor(), lastAdded.getType(), lastAdded.getPrice());
//        return temp;
//    }

    public List<Book> getList()
    {
        List<Book> listOfBooks = new ArrayList<Book>();
        Iterator bookIterator = (Iterator) aInventory.entrySet();
        while(bookIterator.hasNext())
        {
            Map.Entry element = (Map.Entry)bookIterator.next();
            Book aBook = (Book)element.getKey();
            Book currentBook = new Book(aBook.getTitle(), aBook.getAuthor(), aBook.getType(), aBook.getPrice());
            listOfBooks.add(currentBook);
        }
        return listOfBooks;
    }



}