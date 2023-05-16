package com.example.demo;

import java.io.Console;

public class TestingConsole {

    public static void main(String[] args){
        Console console = System.console();


        if(console!=null){
            String str1= console.readLine();
            int a=Integer.parseInt(str1);
            System.out.println("Your number: "+a);


        }

    }
}
