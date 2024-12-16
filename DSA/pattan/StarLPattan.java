package pattan;

import java.util.Scanner;

public class StarLPattan {

    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0; i <n ; i++) {
            int num =1;
                for (int j = 0; j <=i ; j++) {   
                    System.out.print(num+" ");
                    num++;
                }
                System.out.println();
        }

       s.close();
    }
}