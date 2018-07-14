package main.com.chris.demo;


public class Demo1 {

    public static void main(String[] args) {
        sayHello("Chris", "how are you !");
    }


    private static void sayHello(String userName, String greeting) {
        System.out.println("Hello : " + userName + ", " + greeting);

    }
}
