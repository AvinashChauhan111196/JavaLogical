package com.function;

import java.util.Scanner;

public class ReverseNumber
{
    public static void main(String[] args)
    {
        System.out.println("Enter the number ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int reversed = 0;

        while(num != 0)
        {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        System.out.println("The reversed number is " + reversed);
    }
}
