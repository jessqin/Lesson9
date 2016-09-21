package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your grade");
        int grade = input.nextInt();
        if (grade <= 60) {
            System.out.println("You Failed");
        }
        else if (grade <= 70)
        {
            System.out.println("You got a D");
        }
        else
        {
            System.out.print("Not Bad");
        }


    }
}
