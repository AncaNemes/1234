package day05_primitives_concatanation;

public class WatchInfo {
    //brand, color, price, waterResistant, isSmart, gender
   // string string
    public static void main(String[] args){
        String brand="Rolex";
        String color="Diamond";
        double price=27000;
        boolean waterResistant=false;
        boolean isSmart=false;
        char gender= 85;
        System.out.println("Watch brand:"+brand);
        System.out.println("Color:"+color);
        System.out.println("Price"+price);
        System.out.println("water resistant"+waterResistant);
        System.out.println("Smart"+isSmart);
        System.out.println("Gender"+gender);

// in one line
        System.out.println("Watch brand\t\t\t"+brand+"\n"+"Color:\t\t\t"+color+"\n"+"Price:$\t\t"+price+"\n"+"Water\tResistant\t"+waterResistant+"\n"+"Smart:"+isSmart+"\n"+"Gender:"+gender);

    }
}
