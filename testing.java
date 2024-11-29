public class testing {
    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        int x = 111;
        
        int[] arr = new int[35];
        int index = 0;

        while (x>0) {
            int temp = x%2;
            x = x/2 ;
            arr[index++] = temp;
        }

        for(int i = index-1 ; i >= 0 ; i--){
            System.out.print(arr[i]);
        }
    }
}
