package main.com.chris.demo;

import java.util.Date;

public class Demo1 {

	public static void main(String[] args) {
		sayHello("Chris", "how are you !");
		Date now = new Date();
		sayGoodBye("Suan", "women", now);
		sayGoodBye();
	}

	private static void sayHello(String userName, String greeting) {
		System.out.println("Hello : " + userName + ", " + greeting);

	}

	private static void sayGoodBye() {
		System.out.println("Goodbye!");
	}

	private static void sayGoodBye(String userName, String gender, Date date) {
		if ("man".equalsIgnoreCase(gender)) {
			System.out.println("Goodbye, Mt " + userName + ", date : " + date.toString());
		}
		else if ("women".equalsIgnoreCase(gender)) {
			System.out.println("Goodbye, Mr " + userName + ", Date: " + date.toString());
		}

	}

}
