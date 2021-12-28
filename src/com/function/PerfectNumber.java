package com.function;

import java.util.Scanner;

public class PerfectNumber
{

    public static void main(String[] args)
    {
        int i, Sum = 0 ;
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int Number = sc.nextInt();

        for(i = 1; i < Number; i++)
        {
            if(Number % i == 0)
            {
                Sum = Sum + i;
            }
        }
        if (Sum == Number)
        {
            System.out.println(Number + " is a Perfect Number ");
        }
        else
        {
            System.out.println(Number + " is NOT a Perfect Number ");
        }
    }
}
