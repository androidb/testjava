package com.claude;

/**
 * Created by claudiu on 16.01.2017.
 */
import java.util.Scanner;

public class echoline {

    public static void main(String[] args) {
        System.out.println("Enter your text");
        Scanner keyboard = new Scanner(System.in);

        System.out.println (keyboard.next());
        keyboard.close();
    }
}