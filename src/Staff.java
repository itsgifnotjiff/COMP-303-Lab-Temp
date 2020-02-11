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
    public Staff(String pName, Bookstore pStore) {
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

    //Lab 1
    public void recommendLast(){
        Book pBook = aStore.returnLastBook();
        assert(!pBook.equals(null));
        aBookRecommendation.add(pBook);

    }




}