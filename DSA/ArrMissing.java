import java.util.Arrays;

public class ArrMissing {
    public static void main(String[] args) {
        int[] arr = {3,2,4,5,7,6,8};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int ans=0;
        int j=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=j){
                ans=j;
                break;
            }
            j++;
        }
        System.out.println(ans);
    }
}
