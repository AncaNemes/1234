package day30_Arrays;

public class ForEachLoopArray {
    public static void main(String[] args) {
        int [] data={12,43,57,532,24,31,5454,999,3,75};
        for(int n:data){
            System.out.print(n+"\t");
        }
        System.out.println("====================");

        for( int i=0; i < data.length;  i++){
            System.out.println(data[i]);

        }
// print last value in array using length-1
        System.out.println("last element" + data[data.length-1]);
    for (int xo =  data.length-1; xo>=0; xo--){
        System.out.println(data[xo]);
    }

    }
}
