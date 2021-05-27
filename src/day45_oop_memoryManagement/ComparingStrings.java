package day45_oop_memoryManagement;

public class ComparingStrings {
    public static void main(String[] args) {
        String word1 = "java"; //string pool
        String word2 = "java";// it will reuse from string pool
        String word3 = new String ("java"); //create in HEAP, outside of String pool
        String word4 = new String("java");

        System.out.println(word1 == word2); //true
        System.out.println(word1 == word3);  //false
        System.out.println(word3 == word4); //false point to different objects in the HEAP

        System.out.println(word1.equals(word2)); //true
        System.out.println(word1.equals(word3)); //true
        System.out.println(word3.equals(word4)); //true

        // == never compaires the value compares only where it was stored
        //.equals does not care where it was created it compares values if it matches character by character will alwasy give true
    }
}
