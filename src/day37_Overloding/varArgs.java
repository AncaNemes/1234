package day37_Overloding;

public class varArgs {
    public static void main(String[] args) {
        addNumbers(10,5);
        addNumbers(100,200,300);
        addNumbers(1,2,3,43,2,212,3,2,1,23,44,4,4,4,556,66,6,545,4,657,6,76,8,7,689,76,476,4);
        addNumbers();
    }

    public static  void addNumbers(int...nums){
    int sum = 0;
    for( int n:nums){
    sum +=n;
}
        System.out.println("sum= " +sum);
    }
}
