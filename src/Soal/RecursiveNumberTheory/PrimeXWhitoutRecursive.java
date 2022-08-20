package Soal.RecursiveNumberTheory;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeXWhitoutRecursive {

    // untuk tampilan
    public static ArrayList<Integer> containerPrime = new ArrayList<>();
    //untuk tampilan

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("check prime number: ");
        int input = scan.nextInt();

        System.out.printf("bilangan prima ke %d adalah: ",input);
        primeNumber(input);
        System.out.println("\n"+containerPrime);
    }

    public static void primeNumber(int number) {
        int panjang = number*number;
        int indexPrime = 0;
        if(number == 1) System.out.println(2);
        for(int index = 3; index < panjang; index +=2){
            for (int div = 2; div <= index; div++) {
                if(index % div == 0 && div < index){ break; }
                if(div == index || div*div > index){
                    indexPrime++;
                    containerPrime.add(index);
                    break; }
            }
            if (indexPrime == number) {
                System.out.print(index);
                break;
            }
        }
    }
}
