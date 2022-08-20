package Soal.BruteForceGreedyDandC;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MoneyChange {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("pecahan uang:");
        int[] pecahanUang = {1, 10, 20, 50, 100, 200, 500, 1000, 2000, 5000, 10000};
        System.out.println(Arrays.toString(pecahanUang));
        System.out.print("Uang anda: ");
        int uang = scan.nextInt();
        System.out.println("akan ditukarkan");

        ArrayList<Integer> container = new ArrayList<>();
        for (int pecahan = pecahanUang.length-1; pecahan >= 0 ; pecahan--) {
            if (pecahanUang[pecahan] > uang) continue;
            if (uang/ pecahanUang[pecahan] > 0){
                for (int loop = 0; loop < uang/pecahanUang[pecahan]; loop++) {
                    container.add(pecahanUang[pecahan]);
                }
                uang %= pecahanUang[pecahan];
                if (uang == 0 ) break;
            }
        }

        System.out.println(container);
    }
}
