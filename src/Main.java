import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Book b1 = new Book("Söyleme Bilmesinler","Şermin Yaşar",200,2023);
        Book b2 = new Book("4 Gün 3 Gece","Ayşe Kulin",160,2024);
        Book b3 = new Book("Kem Küm","Hatice Kübra Tongar",96,2023);
        Book b4 = new Book("İnsanlığımı Yitirirken","Osamu Dazai",120,2023);
        Book b5 = new Book("Söyleme ","Şern Yaşar",75,2023);
        Book b6 = new Book("Söyleme Bilmesinlr","Şermi Yaşar",123,2023);
        Book b7 = new Book("Söyleme Bilmesiler","Şermin Yaşa",346,2023);
        Book b8 = new Book("Söyleme Bilmenler","Şermin Yar",65,2023);
        Book b9 = new Book("Söyleme Bsinler","Şermin Y",153,2023);
        Book b10 = new Book("Söyle Bilmesinler","Ş Yaşar",39,2023);
        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        books.add(b5);
        books.add(b6);
        books.add(b7);
        books.add(b8);
        books.add(b9);
        books.add(b10);

        Map<String,String> map = books.stream().collect(Collectors.toMap(Book::getBookName, Book::getAuthor));
        List<Book> pages =books.stream().filter(book -> book.getPages()>100).toList();
        pages.forEach(i -> System.out.println(i.getBookName()+":"+i.getPages()));
        map.forEach((bookName,author)->System.out.println(bookName+":"+author));


    }
}