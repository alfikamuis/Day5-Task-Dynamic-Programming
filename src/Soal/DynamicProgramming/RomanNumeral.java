package Soal.DynamicProgramming;

import java.util.Scanner;

public class RomanNumeral {
    static String roman = "";
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("konversi angka ke romawi\n========================");
        System.out.print("masukkan angka: ");
        int input = scan.nextInt();

        System.out.print("Romawi: ");
        System.out.print(romanConversion(input));
    }

    public static String romanConversion(int input) {
        if (input == 0) return roman;

        if (input-1000 >= 0) {
            input -= 1000;
            roman += "M";
        }
        else if (input-500 >=0) {
            input -= 500;
            roman += "D";
        }
        else if (input-100 >=0) {
            input -= 100;
            roman += "C";
        }
        else if (input-90 >=0) {
            input -= 90;
            roman += "XC";
        }
        else if (input-50 >=0) {
            input -= 50;
            roman += "L";
        }
        else if (input-40 >=0) {
            input -= 40;
            roman += "XL";
        }
        else if (input-10 >=0) {
            input -= 10;
            roman += "X";
        }
        else if (input-5 >= 0) {
            input -= 5;
            roman += "V";
        }
        else if (input-1 >= 0) {
            input -= 1;
            roman += "I";
        }
        return romanConversion(input);
    }
}
