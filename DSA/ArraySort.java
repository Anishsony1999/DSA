package DSA;

public class ArraySort {
    public static void main(String[] args) {
        int[] arr ={2,5,245,78,345,253,12,3};
        int l = arr.length;

        for(int i=0;i<l-1;i++){
            int min = i;
            for(int j=i;j<l;j++){
                if(arr[j]<arr[min]) min=j;
            }
            if (min != i) {
                int temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
            }
        }
        for(int i:arr)System.out.print(i+",");
    }
}
