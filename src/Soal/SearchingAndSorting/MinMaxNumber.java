package Soal.SearchingAndSorting;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxNumber {
    public static void main(String[] args) {
        //int[] input = {5, 7, 4, -2, -1, 8};
        System.out.println("masukkan input (contoh: 5,7,4,-2,-1,8): ");
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s = s.trim();
        String[] sArr = s.split(",");
        int[] input = Arrays.stream(sArr).mapToInt(Integer::parseInt).toArray();

        //container min max index
        int[] min = new int[2];
        int[] max = new int[2];

        for (int index = 0; index < input.length; index++) {
            if (min[0] == 0) {
                min[0] = input[index]; //angka
                min[1] = index;  //index
                continue;
            }
            if (input[index] > min[0] && input[index] > max[0]) {
                max[0] = input[index]; //angka
                max[1] = index;  //index
            } else if (input[index] < min[0] && input[index] < max[0]) {
                min[0] = input[index]; //angka
                min[1] = index;  //index
            }
        }
        //System.out.println(Arrays.toString(input)); //untuk manual input
        System.out.printf("min:%d, index:%d\n", min[0], min[1]);
        System.out.printf("max:%d, index:%d\n", max[0], max[1]);
    }
}
