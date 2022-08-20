package Soal.SearchingAndSorting;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumBuyProduct {
    public static void main(String[] args) {
        System.out.println("Product: [15.000, 10.000, 12.000, 5.000, 3.000]");
        int[] productPrice = {15000, 10000, 12000, 5000, 3000};
        System.out.print("Input money (eg. 30.000): ");
        Scanner scan = new Scanner(System.in);
        int money = scan.nextInt();

        Arrays.sort(productPrice); //sortArray
        int counter = 0;
        for(int item: productPrice){
            if (money - item >= 0) {
                money -= item;
                counter++;
            } else {
                break;
            }
        }
        System.out.println("Barang yang bisa dibeli: "+counter);
    }
}
