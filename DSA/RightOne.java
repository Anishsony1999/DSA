import java.util.Arrays;

public class RightOne {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7};  //sorted array
        oRight(a);
    }
    static void oRight(int[] arr){
        int temp = arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;
        System.out.println(Arrays.toString(arr));
    }
}
