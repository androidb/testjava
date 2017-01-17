package com.claude;
import java.util.Scanner;

class Main {
    public static void main (String[] args){

        System.out.println("Enter your text");
        Scanner keyboard = new Scanner(System.in);

        System.out.println (keyboard.next());
        keyboard.close();
        }
}