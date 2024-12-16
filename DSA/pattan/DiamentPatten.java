package pattan;

public class DiamentPatten {
    public static void main(String[] args) {
        int n =5;
        
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n; i >=0 ; i--) {
            for (int j = n-i; j>=0; j--) {
                System.out.print(" ");
            }

            for (int j = i; j>0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
