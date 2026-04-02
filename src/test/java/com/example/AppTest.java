package com.example;
import java.util.Scanner;

public class AppTest {
    App calculator = new App();
    @Test
    void testPercentage() {
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