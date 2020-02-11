
/**
 * A Book Item:
 */
public class Book implements Comparable<Book>
{
    private final String aTitle;
    private final String aAuthor;
    private final BookType aType;
    private final int aPrice; // In cents: 100 = one dollar

    /**
     * Creates a new book item.
     * @param pTitle  The title of the book.
     * @param pAuthor The name of the author
     * @param pType   The category of the book
     * @param pPrice  The price of the item in cents
     */
    public Book(String pTitle, String pAuthor, BookType pType, int pPrice) {
        assert pTitle != null && pAuthor!=null && pType!=null && pPrice>=0;
        aTitle = pTitle;
        aAuthor = pAuthor;
        aType = pType;
        aPrice = pPrice;
    }

    /**
     * @return The title of the book
     */
    public String getTitle()
    {
        return aTitle;
    }

    /**
     * @return The name of the Author.
     */
    public String getAuthor()
    {
        return aAuthor;
    }

    /**
     * @return The category of the book
     */
    public BookType getType()
    {
        return aType;
    }

    /**
     * @return The price of the book in cents
     */
    public int getPrice()
    {
        return aPrice;
    }


    //Lab 1
    @Override
    public int compareTo(Book b2){
        int PriceCompare = b2.getPrice();
        return this.getPrice() - PriceCompare;
    }

    @Override
    public String toString(){
        String temp = this.aTitle +" "+ this.aAuthor +" "+ this.aType +" "+this.getPrice();
        return temp;
    }


}
