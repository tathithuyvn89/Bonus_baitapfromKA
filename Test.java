package Bonus_baitapfromKA;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        //Khai báo 5 cuốn sách thuộc ProgrammingBook và tính giá của nó
        List<Book> books = unit();
        unit();// khởi tạo thư viện
        sumPriceAllBook(books);// Tính tổng tất cả các cuốn sách đã được nhập vào
        //Tính tổng số sách là java
        countJavaBook(books);
        //Tìm kiếm giá của cuốn sách mà người dùng nhập theo tên từ bàn phím
        System.out.print("Please enter book name which you want known its prices : ");
        Scanner scanner= new Scanner(System.in);
        String inputNameBook= scanner.nextLine();
        findPriceByName(books,inputNameBook);
        //Sắp xếp sách theo thứ tự giá tăng dần
        System.out.println(" After sort library");
       for (Book book:books){
            System.out.println(book);
        }
        System.out.println("After sorted library==================");
        ComparePrice comparePrice= new ComparePrice();
        Collections.sort(books,comparePrice);
//        Arrays.sort(books,comparePrice); Tại sao trong trường hợp này không chạy được
        for (Book book:books){
            System.out.println(book);
        }

    }

    private static void findPriceByName(List<Book> books,String m) {
        int index=-1;
        for (int i=0; i<books.size();i++){
            if (books.get(i).getName().equalsIgnoreCase(m)){
                index=i;
                System.out.println("Price of book have name "+m+" is "+books.get(index).getPrice());
            }
        }
        if (index==-1){
            System.out.println("Not exit book name");
        }


    }

    public static void countJavaBook(List<Book> books) {
        int count=0;
        for (Book book :books){
            if(book instanceof ProgrammingBook){
                if (((ProgrammingBook) book).getLanguage().equalsIgnoreCase("java")){
                    count++;
                }
            }
        }
        System.out.println("Sum of java book : "+count);
    }

    private static void sumPriceAllBook(List<Book> books) {
        double sum=0;
        for (Book book:books){
            sum+=book.getPrice();
        }
        System.out.println("Sum of the all book in library is: "+sum);
    }

    private static List<Book> unit() {
        ProgrammingBook book1 = new ProgrammingBook("EN001", "lap trinh", 54000, "Nguyen A", "java", true);
        ProgrammingBook book2 = new ProgrammingBook("EN002", "nhap mon", 56000, "Nguyen B", "java", true);
        ProgrammingBook book3 = new ProgrammingBook("EN003", "hoc mon gi", 56300, "Nguyen C", "Java", false);
        ProgrammingBook book4 = new ProgrammingBook("EN004", "giai phap toi da", 54000, "Nguyen D", "python", true);
        ProgrammingBook book5 = new ProgrammingBook("EN005", "tiem kiem jobs", 56050, "Nguyen E", "oho", false);
        FictionBook book6 = new FictionBook("FT006", "song ao", 89000, "Pham van Ham", "Tieu thuyet");
        FictionBook book7 = new FictionBook("FT007", "ao tu", 84000, "Pham van Khoa", "van hoc");
        FictionBook book8 = new FictionBook("FT008", "gioi tre", 87000, "Pham van Nhat", "truyen cuoi");
        FictionBook book9 = new FictionBook("FT009", "tien la so 1", 81000, "Pham van Toan", "truyen ngu ngon");
        FictionBook book10 = new FictionBook("FT0010", "tien ao", 90000, "Pham van Tiep", "hoi ky");
        List<Book> listBook= new ArrayList<Book>();
        /*Hoạc cách khai báo sau
        private static Book[] init(){
        Book [] books = new Book[10];
        books[0]= new Programming(.....)
        books[1]= new Programming(.....)
        books[2]= new Programming(.....)
        books[3]= new Fiction(.....)
        books[4]= new Fiction(.....)
        books[5]= new Fiction(.....)
        return books;}

         */

        listBook.add(book1);
        listBook.add(book2);
        listBook.add(book3);
        listBook.add(book4);
        listBook.add(book5);
        listBook.add(book6);
        listBook.add(book7);
        listBook.add(book8);
        listBook.add(book9);
        listBook.add(book10);
        return listBook;
    }


}
