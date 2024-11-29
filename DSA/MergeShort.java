

public class MergeShort {

    public static void main(String[] args) {
        int[] arr ={2,4,42,1,57,32,689,54,2,456,7,898,76,3345,6678,3};
        MergeShort m = new MergeShort();
        m.mergeSort(arr,0,arr.length-1);
        for(int i:arr)System.out.print(i+",");
    }

    void merge(int arr[], int l, int m, int r){
        int n1=m-l+1;
        int n2=r-m;
        int[] leftArr =new int[n1];
        int[] rightArr = new int[n2];
        
        for(int i=0;i<n1;i++)leftArr[i]=arr[l+i];
        for(int i=0;i<n2;i++)rightArr[i]=arr[m+1+i];
        
         int i=0,j=0;
         int k=l;
         
         while(i<n1 && j< n2){
            if(leftArr[i]<=rightArr[j]){
                arr[k]=leftArr[i];
                i++;
            }else{
                arr[k]=rightArr[j];
                j++;
            }
            k++;
         }
         while(i<n1){
             arr[k]=leftArr[i];
             k++;
             i++;
         }
         while(j<n2){
             arr[k]=rightArr[j];
             k++;
             j++;
         } 
    }
    void mergeSort(int arr[], int l, int r){
        //code here
        if(l>=r)return;
        int mid = (l+r)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);
    }
    
}
