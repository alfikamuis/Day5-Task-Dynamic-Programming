package Soal.DynamicProgramming;

import java.util.Scanner;

public class FibonacciTopDown {
    public static void main(String[] args) {
        System.out.print("fibonacci top down index-n number: ");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();

        System.out.printf("bilangan fibonacci ke %d adalah: ",input);
        System.out.println(fiboUpDown(input));
    }

    public static int fiboUpDown(int n) {
        if(n == 0 || n== 1) {
            return n;
        }
        else {
            return fiboUpDown(n-1)+fiboUpDown(n-2);
        }
    }
}
