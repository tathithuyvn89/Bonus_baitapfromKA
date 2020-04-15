package Bonus_baitapfromKA;

public class FictionBook extends Book {
    private String category;
    public FictionBook(){

    }

    public FictionBook(String category) {
        this.category = category;
    }

    public FictionBook(String bookCode, String name, double price, String author, String category) {
        super(bookCode, name, price, author);
        this.category = category;
    }

    @Override
    public String toString() {
        return super.toString()+"FictionBook{" +
                "category='" + category + '\'' +
                '}';
    }
}
