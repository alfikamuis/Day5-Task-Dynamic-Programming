package Soal.RecursiveNumberTheory;

import java.util.ArrayList;
import java.util.Scanner;

public class FibbonaciRecursive {

    // untuk tampilan
    public static ArrayList<Integer> containerPrime = new ArrayList<>();
    //untuk tampilan
    public static int n1 = 0;
    public static int n2 = 1;
    public static int temp = 0;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("fibbonaci index-n number: ");
        int input = scan.nextInt();

        System.out.printf("bilangan fibbonaci ke %d adalah: ",input);

        //fibo fungsi pertama (-1) karena 1 sudah di tentukan
        //tampilan arraylist pemanis
        containerPrime.add(1);
        fiboRecurs(input-1);
        System.out.println("\n"+containerPrime);

    }

    public static void fiboRecurs(int n) {
        if (n > 0) {
            temp = n1+n2;
            n1 = n2;
            n2 = temp;
            if (n== 1){
                System.out.print(temp);
            }
            //cotainer untuk tampilan saja
            containerPrime.add(temp);
            fiboRecurs(n-1);
        }
    }
}
