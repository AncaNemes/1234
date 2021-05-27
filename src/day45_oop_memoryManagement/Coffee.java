package day45_oop_memoryManagement;

public class Coffee {
    //can be 0 to 100 as a percentage
    int amount;
    String type;

    @Override
    public String toString() {
        return "Coffee{" +
                "amount=" + amount +
                ", type='" + type + '\'' +
                '}';
    }

    public void refill(){
        amount =100;
    }

    public void drink(int someAmount){
        amount -=someAmount;
    }
    public int getAmount(){
        return amount;

    }
    public void setType(String newType){
        type = newType;
    }
    public String getType(){
        return "type";

    }
}
