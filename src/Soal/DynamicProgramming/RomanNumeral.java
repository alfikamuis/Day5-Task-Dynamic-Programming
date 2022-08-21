package Soal.DynamicProgramming;

import java.util.Scanner;

public class RomanNumeral {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("konversi angka ke romawi\n========================");
        System.out.print("masukkan angka: ");
        int input = scan.nextInt();

        System.out.print("Romawi: ");
        System.out.print(romanConversion(input));
    }

    public static String romanConversion(int input) {
        if (input == 0) return "";

        if (input-1000 >= 0) {
            input -= 1000;
            return "M"+ romanConversion(input);
        }
        else if (input-500 >=0) {
            input -= 500;
            return "D"+ romanConversion(input);
        }
        else if (input-100 >=0) {
            input -= 100;
           return "C"+ romanConversion(input);
        }
        else if (input-90 >=0) {
            input -= 90;
            return "XC"+ romanConversion(input);
        }
        else if (input-50 >=0) {
            input -= 50;
            return "L"+ romanConversion(input);
        }
        else if (input-40 >=0) {
            input -= 40;
            return "XL"+ romanConversion(input);
        }
        else if (input-10 >=0) {
            input -= 10;
            return "X"+ romanConversion(input);
        }
        else if (input-5 >= 0) {
            input -= 5;
            return "V"+ romanConversion(input);
        }
        else if (input-1 >= 0) {
            input -= 1;
            return "I"+ romanConversion(input);
        } else{
            return "";
        }
    }
}
