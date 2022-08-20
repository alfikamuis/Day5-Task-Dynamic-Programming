package Soal.BruteForceGreedyDandC;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchAlgoritm {
    public static void main(String[] args) {

        int[] array = {12, 15, 15, 19, 24, 31, 53, 59, 60};
        System.out.println(Arrays.toString(array));
        Scanner scan =new Scanner(System.in);
        System.out.print("Cari angka: ");
        int input = scan.nextInt();

        if(input < array[0] || input > array[array.length-1]){
            System.out.println("Output: -1");
        } else {
            System.out.print("ada pada index ke-");
            System.out.println(binarySearch(input,array));
        }
    }

    public static int binarySearch(int input,int[] array) {

        int beg = 0;
        int end = array.length-1;
        boolean condition = true;
        while (condition){
            if (beg >= end) return -1;
            int tempPosition = beg+ ((end-beg)/2); //menentukan posisi tengah
            if (array[tempPosition] == input) return tempPosition; //cek apabila angka ditemukan

            if(input < array[tempPosition]){
                end = tempPosition; //end geser
                if (array[end-1] ==  input) return end-1;
            } else {
                beg = tempPosition; //beg geser
                if (array[beg+1] ==  input) return beg+1;
            }

        }
        return input;
    }
}
