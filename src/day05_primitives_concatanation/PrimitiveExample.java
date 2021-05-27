package day05_primitives_concatanation;

public class PrimitiveExample {
    public static void main(String[] args){
        //* WHOLE NUMBER/INTEGER TYPES
        byte byteValue = -128;
        short shortValue= 25786;
        int intValue= 2129987876;
        long longValue= 7262830341303939402L;
        //* DECIMAL NUMBERS/FLOATING POINT TYPES
        float floatValue = 2345.55F;
        double doubleValue = 234532.4334;//* 234532.4434D also valid
        //** CHARACTER TYPE- uses the comas and only ONE character , single character in single quotes
        char charValue ='A';
        char lastLetterofMyname= 'N';
        //*BOOLEAN -true/false***
        boolean booleanValue= true;

        System.out.println(byteValue);
        System.out.println(shortValue);
        System.out.println(intValue);
        System.out.println(longValue);
        System.out.println(floatValue);
        System.out.println(doubleValue);
        System.out.println(charValue);
        System.out.println(lastLetterofMyname);
        System.out.println(booleanValue);
        System.out.println(byteValue + "\n"+ intValue + "\n"+ shortValue +
                "\n"+ floatValue + "\n"+ doubleValue + "\n"+ charValue + "\n"+ booleanValue);

    }
}
