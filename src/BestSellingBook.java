public class BestSellingBook {

    private static final BestSellingBook bestSellingBook = new BestSellingBook();

    private BestSellingBook(){}

    public static BestSellingBook getBestSellingBook(){
        return bestSellingBook;
    }

}