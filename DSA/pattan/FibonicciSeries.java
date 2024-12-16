package pattan;

public class FibonicciSeries {
    public static void main(String[] args) {
        int n =10;

        for (int i = 0; i < n; i++) {
            int num =1;
            //space
            for(int j = i; j <= n-1 ;j++){
                System.out.print(" ");
            }
            // print num
            for (int j = 0; j <= i; j++) {
                System.out.print(num+" " );
                num =num * (i-j)/(j+1);
            }
            System.out.println();
        }
    }
}