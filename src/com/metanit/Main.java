package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner a1 = new Scanner(System.in);

        System.out.print("Введите число: ");
        int max = a1.nextInt();

        if (max>=100)
            System.out.println("less");
        else
            System.out.println("not less");
    }
}
