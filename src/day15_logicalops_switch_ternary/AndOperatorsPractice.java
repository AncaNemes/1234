package day15_logicalops_switch_ternary;

public class AndOperatorsPractice {
    public static void main(String[] args) {
        /*onSale
        freeShipping
        itemName
         */

        boolean onSale=true, freeShipping=true;
        String itemName=" java book ";
          freeShipping=false;
        if (onSale&&freeShipping) {
            System.out.println(itemName + " add to cart");
        } else{
                System.out.println("Continue shopping for good deals"+itemName);
            }
        if(freeShipping && onSale && itemName.equals("javabook")){
                System.out.println("Continue shopping for good deals"+itemName);
    }

        }
    }

