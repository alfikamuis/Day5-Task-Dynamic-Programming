package Soal.BruteForceGreedyDandC;

import java.util.Scanner;

public class SimpleEquations {
    static int A,B,C;
    static boolean solution = false;
    public static void main(String[] args) {
        //input
        //14,84,74 = 4,7,3
        //20,8000,1200 = 20,20,20
        //57,6859,1083 = 19,19,19

        Scanner scan = new Scanner(System.in);
        System.out.println("A = x+y+z\nB = x*y*z\nC = (x*x)+(y*y)+(z*z)");
        System.out.println("Input 3 number");
        System.out.print("A: ");
        A = scan.nextInt();
        System.out.print("B: ");
        B = scan.nextInt();
        System.out.print("C: ");
        C = scan.nextInt();

        int maxLoop = 21; //21*21*21 <10000 restriction
        int startTemp =A/3; // start loop optimized
        if (startTemp == 0) startTemp =1;
        int startSecondTemp= (C/3)/startTemp;
        int x,y,z;
        if (
                A >= 1  && A <= 10000 &&
                B >= 1 && B <= 10000 &&
                C >= 1 && C <= 10000
        ) {
            for (int temp = startTemp; temp <=maxLoop ; temp++) {
                if(B% temp == 0){
                    for (int secondTemp = startSecondTemp; secondTemp <=maxLoop ; secondTemp++) {
                        if(B% secondTemp == 0){
                            if(A > B && A> C){
                                System.out.println("solution not found!");
                                temp = maxLoop;
                                break;
                            }
                            int tirdTemp = A - (secondTemp+temp);
                            if(tirdTemp < 0) break;

                            //System.out.printf("%d %d %d\n",temp,secondTemp,tirdTemp);
                            if (check(temp,secondTemp,tirdTemp)){;
                                temp = maxLoop;
                                break;
                            }
                        }
                    }
                }
            }
        } else {
            System.out.println("unreachable input!");
        }

        if (!solution){
            System.out.println("solution not found!");
        }
    }

    public static boolean check(int x,int y,int z){
        if(
            A == x+y+z &&
            B == x*y*z &&
            C == (x*x)+(y*y)+(z*z)
        ){
            System.out.printf("x=%d y=%d z=%d\n",x,y,z);
            solution = true;
            return true;
        }

        return false;
    }
}
