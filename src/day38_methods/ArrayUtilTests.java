package day38_methods;

public class ArrayUtilTests {
    public static void main(String[] args) {
        int [] nums={5,23,543,90};
        ArrayUtils.printArray(nums); // if used with vaiable below it will not be assigned to the private method
        ArrayUtils.printArray(new int [] {23,43,232,43,4321});// it will assign the numbers to the private method
        System.out.println("sum= " +ArrayUtils.sum(nums));
        System.out.println("sum= " +ArrayUtils.sum(new int [] {23,43,232,43,4321}));



        int [] num2={4,1,5,8};
        System.out.println(" found= "+ ArrayUtils.contains(num2, 5));
        System.out.println("10 found= "+ ArrayUtils.contains(num2, 10));


    }
}
