package com.gmail.fastus1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        new Thread(
                () -> System.out.println("hello world")
        ).start();

        Arrays.asList("Кот", "Пёс", "Котопёс")
                .stream() .filter(v -> v.startsWith("Кот"))
                .forEach(System.out::println);
    }
}
