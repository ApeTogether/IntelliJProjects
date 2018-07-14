package main.com.chris.demo;


public class Demo1 {

    public static void main(String[] args) {
        sayHello("Chris", "how are you !");
        sayGoodBye("Suan", "women");
    }


    private static void sayHello(String userName, String greeting) {
        System.out.println("Hello : " + userName + ", " + greeting);

    }

    public static void sayGoodBye(String userName, String gender) {
        if ("man".equalsIgnoreCase(gender)) {
            System.out.println("Goodbye, Mt " + userName);
        } else if ("women".equalsIgnoreCase(gender)) {
            System.out.println("Goodbye, Mr " + userName);
        }

    }


}
