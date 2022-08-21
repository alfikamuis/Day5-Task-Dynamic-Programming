package Soal.DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class Frog {
    static int sumJump =0;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("copy->paste path below \n10,30,40,20 \n30,10,60,10,60,50");
        System.out.print("path: ");
        String[] sArr = (scan.nextLine()).split(",");
        int[] input = Arrays.stream(sArr).mapToInt(Integer::parseInt).toArray();

        System.out.println("\nminimum output: "+minJumpFrog(sArr.length-1,input));
    }

    public static int minJumpFrog(int length,int[] arr) {
        if (length == 0) return sumJump;
        try{
            if (
                    Math.abs(arr[length]- arr[length-2]) <
                            Math.abs(arr[length] - arr[length-1]))
            {
                sumJump += Math.abs(arr[length]- arr[length-2]);
                System.out.print("->"+sumJump);
                length -=2;
            } else {
                sumJump += Math.abs(arr[length] - arr[length-1]);
                System.out.print("->"+sumJump);
                length--;
            }
        } catch (Exception e){
            sumJump += Math.abs(arr[length] - arr[length-1]);
            System.out.print("->"+sumJump);
            return sumJump;
        }
        return minJumpFrog(length,arr);
    }
}
