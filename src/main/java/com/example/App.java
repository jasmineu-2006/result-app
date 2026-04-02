package com.example;
import java.util.Scanner;

System.out.println("Result Classification System");
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks of 5 subjects: ");
        int total = 0;

        for(int i = 0; i < 5; i++) {
            total += sc.nextInt();
        }

        double percentage = total / 5.0;

        System.out.println("Total: " + total);
        System.out.println("Percentage: " + percentage);

        if(percentage >= 90)
            System.out.println("Grade: A");
        else if(percentage >= 75)
            System.out.println("Grade: B");
        else if(percentage >= 50)
            System.out.println("Grade: C");
        else
            System.out.println("Fail");
    }
}
