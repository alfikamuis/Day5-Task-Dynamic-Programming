package Soal.BruteForceGreedyDandC;

import java.util.Scanner;

public class SimpleEquations {
    public static void main(String[] args) {

        //input
        Scanner scan = new Scanner(System.in);
        System.out.println("Input 3 number");
        System.out.print("A: ");
        int A = scan.nextInt();
        System.out.print("B: ");
        int B = scan.nextInt();
        System.out.print("C: ");
        int C = scan.nextInt();

        for (int index = 1; index < A; index++) {
            if (
                    index+(index+1)+(index+2) == A &&
                            index*(index+1)*(index+2) == A &&
            ){

            }

        }

        A = x+y+z;
        B = x*y*z;
        C = (x*x)+(y*y)+(z*z);

        if (
                A >= 1 && A <= 10000 &&
                B >= 1 && B <= 10000 &&
                C >= 1 && C <= 10000
        ) {
            System.out.println("1, 2, 3");
        } else {
            System.out.println("no solution!");
        }
        System.out.printf("\n%d %d %d",A,B,C);
    }

    public static void add(){

    }
}
