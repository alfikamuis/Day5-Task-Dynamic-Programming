package Soal.BruteForceGreedyDandC;

import java.util.Scanner;

public class SimpleEquations {
    static int A,B,C;
    public static void main(String[] args) {
        //input
        Scanner scan = new Scanner(System.in);
        System.out.println("A == x+y+z\nB == x*y*z\nC == (x*x)+(y*y)+(z*z)");
        System.out.println("Input 3 number");
        System.out.print("A: ");
        A = scan.nextInt();
        System.out.print("B: ");
        B = scan.nextInt();
        System.out.print("C: ");
        C = scan.nextInt();

        int x,y,z;
        if (
                A >= 1 && A <= 10000 &&
                B >= 1 && B <= 10000 &&
                C >= 1 && C <= 10000
        ) {

            for (int temp = 1; temp <=20 ; temp++) {
                if(B% temp == 0){
                    for (int secondTemp = 1; secondTemp <=20 ; secondTemp++) {
                        if(B% secondTemp == 0){
                            if(A > B && A> C){
                                System.out.println("solution not found!");
                                temp = 20;
                                break;
                            }
                            int tirdTemp = A - (temp+secondTemp);
                            if(tirdTemp <= 0){
                                temp+= 1;
                                break;
                            }
                            if(B%tirdTemp == 0){
                                System.out.printf("%d %d %d\n",temp,secondTemp,tirdTemp);
                                if (check(temp,secondTemp,tirdTemp)){
                                    temp = 20;
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            System.out.println("out of reach");
        }
    }

    public static boolean check(int x,int y,int z){
        if(
            A == x+y+z &&
            B == x*y*z &&
            C == (x*x)+(y*y)+(z*z)
        ){
            System.out.printf("x:%d y:%d z:%d",x,y,z);
            return true;
        }

        return false;
    }
}
