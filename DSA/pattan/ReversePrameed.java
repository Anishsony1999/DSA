package pattan;

public class ReversePrameed {
    public static void main(String[] args) {
        int n = 5;
        for (int i = n; i >=0 ; i--) {
            for (int j = n-i; j>0; j--) {
                System.out.print(" ");
            }

            for (int j = i; j>=0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
}
