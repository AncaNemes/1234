package day50_inheritance;

public class Ebook extends Book{
    int size, pages;

    public void readBook(){
        System.out.println("reading book:");
        System.out.println("title=" + title);
        System.out.println("author="+author);
        System.out.println("size= " + size) ;
        System.out.println("pages= " +pages);
    }
}
