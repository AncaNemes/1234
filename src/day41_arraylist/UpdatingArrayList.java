package day41_arraylist;

import java.util.ArrayList;
import java.util.List;

public class UpdatingArrayList {
    public static void main(String[] args) {

       List<String> myCars= new ArrayList<>();

        myCars.add("toyota");
        myCars.add("mazda");
        myCars.add("audi");
        myCars.add("tesla");
        myCars.add("dacia");
        myCars.add("moskvich");
        myCars.add(0,"jeep");
        myCars.add(1,"lada");
        myCars.add(2,"yugo");
        System.out.println(myCars);
        System.out.println(myCars.toString());//diff ways to print out  print all cars

        String allCarsIn1Str= myCars.toString(); // print all cars in one string variable
        System.out.println("allCarsIn1Str " + allCarsIn1Str);
        //change index) into Lanborghini
        myCars.set(0,"lamborghini");
        System.out.println("after.set =" +myCars.toString());

        myCars.set(4,"honda");
        System.out.println("after index 4" + myCars.toString());

        /* How would you do that if MyCars was array
        myCars[4]=Honda
        */
//find the index nb of "ford"- by using indexOf
        System.out.println("index of moskvich = " +myCars.indexOf("moskvich"));
        int ladaIndex= myCars.indexOf("lada");
        System.out.println("ladaIndex=  "+ ladaIndex);

        //change moskvich to jiguli
        myCars.set(ladaIndex,"jiguli");
        System.out.println("changing " + myCars);

        //replace ford with trabant using single statement
      //  myCars.indexOf("ford");
        myCars.set(myCars.indexOf("yugo"),"trabant");
        System.out.println("after set to trabant " + myCars);
        System.out.println();

        //change lada-bugatti
        //if my Cars contains "lada" find index of lada and set value to bugatti otherwise lada not founf

        if(myCars.contains("lada")){
           myCars.set(myCars.indexOf("lada"),"bugatti");
        }else{
            System.out.println("lada is nout found");
        }
        System.out.println("after set bugatti = " + myCars);

        /**lamborghini > prius
         lada>lexus
         trabant>audi*/

        for(int i=0; i< myCars.size();i++){
            if(myCars.get(i).equals("lamborghini")){
                myCars.set(i,"prius");

            }else if (myCars.get(i).equals("toyota")) {
             myCars.set(i,"lexus");
            }else if(myCars.get(i).equals("trabant")){
                myCars.set(i,"ww");
            }
        }
        System.out.println("after loop =" +myCars);

    }
}
