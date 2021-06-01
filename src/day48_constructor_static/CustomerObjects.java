package day48_constructor_static;

import java.util.ArrayList;
import java.util.List;

public class CustomerObjects {
    public static void main(String[] args) {
        Customer cs1= new Customer();
      //  System.out.println(cs1.toString());//print with defult values that are set in no-args constructor
        System.out.println(cs1);
        cs1.setId(1);
        cs1.setName("Bob");
        System.out.println(cs1);

       Customer cs2= new Customer("Mike", 2);
       Customer cs3 = new Customer("John Ward", 3);
        System.out.println(cs2);
        System.out.println(cs3);

        //array of customer
        Customer[] todaysCustomers={cs1,cs2, cs3, new Customer("Bashir", 449)};


        //arrayList of Custoemr Object

        List<Customer> CustomerList = new ArrayList<>();
        CustomerList.add(cs1);
        CustomerList.add(cs2);
        CustomerList.add(cs3);
        CustomerList.add(new Customer("Bashir", 449));
        CustomerList.add(new Customer("Suleyman", 9763));


    }
}
