package test;

import main.com.chris.demo.User;

/**
 * @Auther Chris Lee
 * @Date 7/17/2018 18:09
 * @Description
 */
public class Test01 {

    public static void main(String[] args) {
        User user = new User();
        User user2 = new User("Chris", 21);

        System.out.println(user.toString());
        System.out.println(user2.toString());
    }

}
