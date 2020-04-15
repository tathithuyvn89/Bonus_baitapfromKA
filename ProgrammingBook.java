package Bonus_baitapfromKA;

public class ProgrammingBook extends Book {
    private String language;
    private boolean framwork;
     public static int count=0;
    public ProgrammingBook(){

    }
    public ProgrammingBook(String language, boolean framwork) {
        this.language = language;
        this.framwork = framwork;
    }

    public ProgrammingBook(String bookCode, String name, double price, String author, String language, boolean framwork) {
        super(bookCode, name, price, author);
        this.language = language;
        this.framwork = framwork;
        if (language.equals("java")) {
            count++;
        }
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {

        this.language = language;
    }

    public boolean isFramwork() {
        return framwork;
    }

    public void setFramwork(boolean framwork) {
        this.framwork = framwork;
    }

    @Override
    public String toString() {
        return super.toString()+"ProgrammingBook{" +
                "language='" + language + '\'' +
                ", framwork=" + framwork +
                '}';
    }
}
