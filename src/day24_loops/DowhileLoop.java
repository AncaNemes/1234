package day24_loops;

public class DowhileLoop {
    public static void main(String[] args) {
        int count=1;
        do{
            System.out.println("count=" +count);
            count+=50;
        } while(count <= 1000);
    }
}
