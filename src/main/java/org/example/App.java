package org.example;
import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Kontawat Niyamabha
 */
public class App {
    public static void main(String[] args) {
        String user, password;
        System.out.println("What is your username?");
        Scanner input = new Scanner(System.in);
        user = input.nextLine();
        System.out.println("What is the password?");
        password = input.nextLine();
        if ("abc$123".equals(password))
        {
            System.out.println("Welcome!");
        }
        else
        {
            System.out.println("I don't know you.");
        }
    }
}