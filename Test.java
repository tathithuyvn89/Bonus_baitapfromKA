package Bonus_baitapfromKA;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Test {
    // public ProgrammingBook(String bookCode, String name, double price, String author, String language, boolean framwork)
    //public FictionBook(String bookCode, String name, double price, String author, String category) {
    public static void main(String[] args) {
        //Khai báo 5 cuốn sách thuộc ProgrammingBook và tính giá của nó
        ProgrammingBook book1 = new ProgrammingBook("EN001", "lap trinh", 54000, "Nguyen A", "java", true);
        ProgrammingBook book2 = new ProgrammingBook("EN002", "nhap mon", 56000, "Nguyen B", "java", true);
        ProgrammingBook book3 = new ProgrammingBook("EN003", "hoc mon gi", 56300, "Nguyen C", "java", false);
        ProgrammingBook book4 = new ProgrammingBook("EN004", "giai phap toi da", 54000, "Nguyen D", "python", true);
        ProgrammingBook book5 = new ProgrammingBook("EN005", "tiem kiem jobs", 56050, "Nguyen E", "oho", false);
        FictionBook book6 = new FictionBook("FT006", "song ao", 89000, "Pham van Ham", "Tieu thuyet");
        FictionBook book7 = new FictionBook("FT007", "ao tu", 84000, "Pham van Khoa", "van hoc");
        FictionBook book8 = new FictionBook("FT008", "gioi tre", 87000, "Pham van Nhat", "truyen cuoi");
        FictionBook book9 = new FictionBook("FT009", "tien la so 1", 81000, "Pham van Toan", "truyen ngu ngon");
        FictionBook book10 = new FictionBook("FT0010", "tien ao", 90000, "Pham van Tiep", "hoi ky");
        //In ra giá của 10 cuốn sách đã tạo
        System.out.println(Book.sum);
        // Kiểm tra đối với lớp con xem có giống kết quả không=>Giống như dự đoán
        System.out.println(FictionBook.sum);
        System.out.println(ProgrammingBook.sum);
        // Tìm ra xem trong 10 cuốn sách này thì có mấy quấn là java
        ProgrammingBook java=new ProgrammingBook();
        System.out.println(java.count);
        // Tim gia cua cuon sach theo ten nhap vao tu ban phim

        List<Book> listBook= new ArrayList<Book>();
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
        Book book=listBook.get(2);
        System.out.println(book.getPrice());
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter book's name you want search : ");
        String nameInput = scanner.nextLine();
        int index=-1;
        for (int i=0;i<listBook.size();i++){

            if (listBook.get(i).getName().equals(nameInput)){
                index=i;
            }
        }
        if (index==-1){
           System.out.println(" Not exit book name");
       } else {
           System.out.println("Price of book is "+ listBook.get(index).getPrice());
       }
        // Sap xep thu vien theo gia cua cuon sach tang dan;


//        String[] name = {book1.getName(), book2.getName(), book3.getName(), book4.getName(), book5.getName(), book6.getName(),
//                book7.getName(), book8.getName(), book9.getName(), book10.getName()};
//        double[] price = {book1.getPrice(), book2.getPrice(), book3.getPrice(), book4.getPrice(), book5.getPrice(),
//                book6.getPrice(), book7.getPrice(), book7.getPrice(), book9.getPrice(), book10.getPrice()};

//        System.out.println(Arrays.toString(name));
//        System.out.println(Arrays.toString(price));
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter book's name you want search : ");
//        String nameInput = scanner.nextLine();
//       int index= findPrice(name,nameInput);
//       if (index==-1){
//           System.out.println(" Not exit book name");
//       } else {
//           System.out.println("Price of book is "+ price[index]);
//       }
//       // Sap sep thu vien theo gia cua tung quan sach
//        Arrays.sort(price);
//        System.out.println(Arrays.toString(price));
//        System.out.println(book1);
//        System.out.println(book2);
//        System.out.println(book3);
//        System.out.println(book4);
//        System.out.println(book5);
//        System.out.println(book6);
    }
    public static  int findPrice(String [] arr,String a){
        int index=-1;
        for (int i=0;i<arr.length;i++){
            if (arr[i].equals(a)){
                index=i;
            }
        }
        return index;
    }

}
