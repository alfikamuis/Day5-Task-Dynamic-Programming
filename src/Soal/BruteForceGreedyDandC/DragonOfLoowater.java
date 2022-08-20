package Soal.BruteForceGreedyDandC;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DragonOfLoowater {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Height Head dragon: ");
        String[] dragon = scan.nextLine().split(",");
        System.out.print("Height knight: ");
        String[] knight = scan.nextLine().split(",");
        int[] headDragon = Arrays.stream(dragon).mapToInt(Integer::parseInt).toArray();
        int[] knightJump = Arrays.stream(knight).mapToInt(Integer::parseInt).toArray();


        ArrayList<Integer> container = new ArrayList<>();
        int min = 0;
        int minSumJump =0;
        for(int head: headDragon){
            for(int jump: knightJump ){
                if(jump >= head ){
                    if (min == 0) {
                        min = jump;
                        continue;
                    }
                    if (jump < min) { //simpan jump terkecil
                        min = jump;
                    }
                }
            }
            if(min == 0){ //jika tidak ada jump sama sekali == knightfall
                minSumJump = 0;
                break;
            }
            container.add(min);
            minSumJump += min;
            min = 0;
        }

        if(minSumJump == 0){
            System.out.println("Knight Fall");
        } else {
            System.out.println("Minimum effort: "+minSumJump);
        }

        //System.out.println(container);
    }
}
