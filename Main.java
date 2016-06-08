package com.gmail.fastus1;

public class Main {

    public static void main(String[] args) {

        new Thread(
                () -> System.out.println("hello world")
        ).start();
    }
}
