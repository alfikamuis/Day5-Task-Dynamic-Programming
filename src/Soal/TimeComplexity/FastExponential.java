package Soal.TimeComplexity;

import java.util.Scanner;

public class FastExponential {

    static int counter = 0;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("exponential number\n number\t: ");
        int inputNumber = scan.nextInt();
        System.out.print("pangkat\t: ");
        int exp = scan.nextInt();

        System.out.println(exponential(inputNumber,exp));
    }

    public static int exponential(int number,int exp){
        //kembalian 1 karena hasil akhir masuk perkalian
        if(exp == 0){ return 1; }
        else{ return number*(exponential(number,exp-1)); }
    }
}

