package com.function;

import java.util.*;

public class TemperatureConversion {
    public static void main(String args[])
    {
        double f,c = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose type of conversion \n 1. Fahrenheit to Celsius \n 2. Celsius to Fahrenheit");
        int ch = sc.nextInt();
        switch(ch)
        {
            case 1:
                System.out.println("Enter the Fahrenheit temperature");
                f=sc.nextDouble();
                c=(f-32)* 5/9;
                System.out.println("celsius temperature is "+c);
                break;
            case 2:
                System.out.println("Enter the celcius temperature");
                f=sc.nextDouble();
                c=((9*c)/5)+32;
                System.out.println("Fahrenheit temperature is "+c);
                break;
            default:
                System.out.println("Please enter valid option");
        }

    }


}
