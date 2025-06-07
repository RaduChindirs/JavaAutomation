package DesignPatern;

public class SingalObject {
    private  static SingalObject instace=new SingalObject();
    private SingalObject (){}
        public static SingalObject getInstance(){
            return instace;

        }

        public  void showMessage(){
            System.out.println("Hello from singleton");
        }

    }

