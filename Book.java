package Bonus_baitapfromKA;

public class Book {
    private String bookCode;
    private String name;
    private double price;
    private String author;
    public static double sum=0;
    public Book(){

    }
    public Book(String bookCode, String name, double price, String author) {
        this.bookCode = bookCode;
        this.name = name;
        this.price = price;
        this.author = author;
        sum+=price;

    }

    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;

    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public String toString(){
        return " Book has code" +getBookCode()+" name "+ getName()+ " price "+ getPrice()+ " author "+ getAuthor();
    }

//    @Override
//    public int compareTo(Book book) {
//        if(getPrice()>book.getPrice()){
//            return 1;
//        } else if (getPrice()<book.getPrice()){
//            return -1;
//        } else {
//            return 1;
//        }
//    }
}
