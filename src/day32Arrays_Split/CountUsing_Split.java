package day32Arrays_Split;

public class CountUsing_Split {
    public static void main(String[] args) {
        //counting occurances of string using split
        System.out.println("new practice cat**************");
        String catTypes = "bengal cat tabby cat persian cat no cat here cat type";

        String [] catArrays= catTypes.split("cat");
        System.out.println("number of cat = " + (catArrays.length-1));
        for (String type: catArrays){
            System.out.println(type);
        }

       /*
        String app = "etsy";
    String zones = "us-east-1,us-west-2,us-west-1"

        int count=0;
        for (int i=0; i < cats.length()-2;i++){
            if(cats.substring(i, i+3).equals("cats"))
            {
                count++;
            }
        }
        System.out.println("count of cats "+count);*/

    }
}
