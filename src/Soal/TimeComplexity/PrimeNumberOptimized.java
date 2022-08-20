package Soal.TimeComplexity;

import java.util.Scanner;

public class PrimeNumberOptimized {
    static int i = 2;
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("check prime number: ");
        int input = scan.nextInt();

        System.out.println(primeNumber(input));
    }

    //recursive
    public static boolean primeNumber(int number){

        // kondisi default
        if (number == 0 || number == 1) return false;
        if (number == i) return true;

        //jika bisa dibagi salah
        if (number % i == 0) return false;
        //optimasi i*i>number false
        if(i*i>number) return false;
        i++;

        return primeNumber(number);
    }
}
