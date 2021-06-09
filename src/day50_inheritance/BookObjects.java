package day50_inheritance;

public class BookObjects {
    public static void main(String[] args) {
       Book book= new Book();
book.title= "intro to java";
book.author="savitch";
book.type="programming";
book.price=25.0;
        System.out.println(book.title);
        System.out.println(book.price);
        System.out.println(book.author);
        System.out.println(book.type);



    }
}
