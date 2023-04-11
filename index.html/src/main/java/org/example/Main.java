package org.example;


import java.text.Format;
import java.time.LocalDateTime;
import java.util.Formatter;

public class Main {
    public static void main(String[] args) {
        System.out.println(LocalDateTime.now().plusHours(10));
        for (int i = 0; i < 10; i++) {
            System.out.println(i + (i * 3));

        }
    }
}