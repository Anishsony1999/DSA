public class Right2D {
    public static void main(String[] args) {
        int[] a ={1,2,3,4,5,6,7};
        int d=3;
        int l = a.length;
        r2d(a,d,l);
        r2dTime(a,d,l);
    }

    static void r2d(int[] arr,int d,int l){
        d=d%l;
        int[] temp = new int[d];

        for(int i=0;i<d;i++){
            temp[i] = arr[i];
        }

        for(int i=d;i<l;i++){
            arr[i-d] = arr[i];
        }

        for(int i=l-d;i<l;i++){
            arr[i] = temp[i-(l-d)];
        }

        for(int x:arr)System.out.print(x);
    }
    static void r2dTime(int[] arr,int d,int l){
        
    }
}
