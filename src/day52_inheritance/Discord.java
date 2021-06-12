package day52_inheritance;

public class Discord extends MobileApp {

    public void chat (String someone){
        System.out.println("chatting with "+ someone + " in discord");




    }



    //override download method


//    protected boolean download(double version){
//        System.out.println("Downloaded Discord " + version);
//        return true;
//    }
    @Override
    public boolean download(){
        System.out.println("Download Discord from App Store");
    return true;
    }


    @Override
    public void useTheApp(int minutes){
        super.useTheApp(minutes);
        chat("Murodil");

    }

    public void printInfo(){
        System.out.println("App name " + getName());
        System.out.println("App version " + getVersion());
    }
}
