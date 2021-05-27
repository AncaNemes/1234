package day14_multi_branch_if_statement;

public class ChooseLanguage {
    public static void main(String[] args) {

        int selection=4;
        if (selection==1) {
            System.out.println("thank you for your call");
        } else if (selection==2) {
            System.out.println("hola, gracias para llamar");
        } else if (selection==3) {
            System.out.println("merhaba, aradiginiz icintesekkurler");
        } else if (selection==4) {
            System.out.println("privet, spasiba za vash znovok");
        } else if (selection==5){
            System.out.println("Mersi, por votre appel");
        } else {
            System.out.println("lets talk java and english");

        }
    }
}
