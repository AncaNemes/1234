package day56_abstraction;

public class Romanian implements Greeting{
    @Override
    public void hi(){
        System.out.println("Salut");
    }
    @Override
    public void bye(){
        System.out.println("La revedere");
    }
}
