package main.com.chris.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Auther Chris Lee
 * @Date 7/17/2018 14:59
 * @Description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String name;
    private int age;

}
