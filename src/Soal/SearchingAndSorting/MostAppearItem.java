package Soal.SearchingAndSorting;

import java.util.HashMap;
import java.util.Scanner;

public class MostAppearItem {
    public static void main(String[] args) {

        //String[] input = {"js","js","golang","ruby","ruby","js","js"};
        //System.out.println(Arrays.toString(input));
        System.out.println("contoh input -> js,js,golang,ruby,ruby,js,js");
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] input = s.split(",");


        HashMap<String,Integer> container = new HashMap<>();
        for (String item:input){
            if (!container.containsKey(item)) {
                container.put(item,1);
            } else {
                container.put(item,container.get(item)+1);
            }
        }

        System.out.println("\nmost appear item:");
        System.out.println(container);
    }
}
