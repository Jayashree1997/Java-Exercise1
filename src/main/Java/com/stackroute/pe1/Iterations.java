package com.stackroute.pe1;

import java.util.Scanner;

public class Iterations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of iterations: ");
        int num = sc.nextInt();
        for (int i = 0; i <= num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
        }
    }
}
