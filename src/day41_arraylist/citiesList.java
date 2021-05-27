package day41_arraylist;
import java.util.*;

public class citiesList {
    public static void main(String[] args) {
       //declare arraylist
        ArrayList<String>cities=new ArrayList<>();

        cities.add("Washington DC");//index 0
        cities.add("Vienna");       //index1
        cities.add("Adana");
        cities.add("New York");
        cities.add("LA");
        //add Ashkabat first to the cities

        cities.add(0,"Ashgabat"); //method overloading
        //print all values i same line
        System.out.println(cities);
        System.out.println("first city= " +cities.get(0));
        System.out.println("lasy city= " +cities.get(5));
        System.out.println("last city dynamic"+ cities.get(cities.size()-1));
        //print count of items in arraylist
        System.out.println("count if items= " + cities.size());
        int size= cities.size();
        System.out.println("there are " + size + " cities in the list");


        for(int i=0; i < cities.size(); i++){
            System.out.print(cities.get(i)+ " ");}

        for(int i=0; i < cities.size()/2; i++){ // /2 to get only half od the list do in the loop divided by 2 /2
              System.out.print(cities.get(i)+ " ");
 }
        System.out.println();

        for(String city : cities) {
            System.out.print(city +" ");
        }



        System.out.println();

     //delete items from arraylist
        //1 remove using index
        cities.remove(3);
        //2 remove using object/value
        cities.remove("New York");
        System.out.println("after remove " +cities+ " ");

        System.out.println();

//1. print\spit it out
        cities.clear();
        System.out.println("cities=" + cities);


//2. using isempty
if(cities.isEmpty()){
    System.out.println("list is empty");
}

//3 check size()==0
        if(cities.size()==0){
            System.out.println("list is empty");
        }
    }

}
