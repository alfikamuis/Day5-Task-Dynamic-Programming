package Soal.DynamicProgramming;

import java.util.Scanner;

public class FibonacciBottomUp {
    static int n1 =0; //n=0
    static int n2=1; //n=1
    static int temp =0;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("fibonacci bottom up index-n number: ");
        int input = scan.nextInt();

        System.out.printf("bilangan fibonacci ke %d adalah: ",input);
        fibBottomUp(input);

    }

    public static void fibBottomUp(int n) {
        if (n > 0) {
            temp = n1 + n2;
            n1 = n2;
            n2 = temp;
            if (n == 1) {
                System.out.print(temp);
            }
            fibBottomUp(n - 1);
        }
    }
}
