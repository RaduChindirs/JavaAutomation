package DesignPatern;

public class SingleTonDemo {
    public static void main(String[]arg){
        SingalObject myObject=SingalObject.getInstance();
        myObject.showMessage();
    }
}
