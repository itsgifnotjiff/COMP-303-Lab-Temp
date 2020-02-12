import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

/**
 * Represents a staff member working in a bookstore
 */
public class Staff {

    final private String aName;
    private Bookstore aStore;
    private List<Book> aBookRecommendation;

    /**
     * Creates a new staff with an unique name,
     * associated with one bookstore.
     * @param pName A unique identifier for the staff.
     * @param pStore  The bookstore the staff current works at.
     */
    public Staff(String pName, Bookstore pStore)
    {
        aName = pName;
        aStore = pStore;
        aBookRecommendation = new ArrayList<>();
    }

    /**
     * Change the staff to a different bookstore
     * @param pStore The new bookstore at which the staff will work
     */
    public void changeBookstore(Bookstore pStore)
    {
        aStore = pStore;
    }

    public void recommendLast()
    {
        Book pBook = aStore.returnLastBook();
        assert(!pBook.equals(null));
        aBookRecommendation.add(pBook);
    }
    //Alternative
    //this relies on the toString method from the book class
//    public void recommendLast(){
//        System.out.println(aStore.returnLastAdded());
//    }

    public boolean duplicateRecommendation()
    {
        for(Book b: aBookRecommendation)
        {
            int index = aBookRecommendation.indexOf(b);
            return (index == aBookRecommendation.lastIndexOf(b));
        }
        return false;
    }

    private boolean listEmpty()
    {
        return aBookRecommendation.isEmpty();
    }

    private static Book getFirst(List<Book> pList)
    {
        Book temp = pList.get(0);
        return temp;
    }

    /**
     * If the attribute aBookRecommendation is empty
     * we obtain the list of books from the bookstore
     * @pre List of books is not empty
     * add to the aBookRecommendation list the first book
     * in the list returned by the BookStore class
     *
     */
    public void updateRecommendation()
    {
        if (listEmpty())
        {
            List<Book> recommendations = aStore.getList();
            assert !recommendations.isEmpty();
            Book firstBook = getFirst(recommendations);
            aBookRecommendation.add(firstBook);
        }
    }



}