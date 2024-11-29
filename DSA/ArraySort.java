

public class ArraySort {
    public static void main(String[] args) {
        int[] arr ={2,5,245,78,345,253,12,3};
        int leg = arr.length;

        for(int i=0;i<leg-1;i++){  // i =0   
            int min = i;
            for(int j=i+1;j<leg;j++){
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
