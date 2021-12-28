package com.function;

import java.util.Scanner;

public class Utility {



    private static final Scanner scan = new Scanner(System.in);

    public static char getuserChar() {
        return scan.next().charAt(0);
    }

    public static int getUserInteger() {
        return scan.nextInt();
    }

}
