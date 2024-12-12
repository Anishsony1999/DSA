 
import java.util.HashMap;
import java.util.Scanner;

public class NumberHasing {
    
    public static void main(String[] args) {
        int[] arr ={1,2,5,1,1,3,5,2,3};

        Scanner sc = new Scanner(System.in);
        HashMap<Integer,Integer> map =new HashMap<>();

        for(int i=0;i<arr.length;i++){
            int key = arr[i];
            int val = 0;
            if(map.containsKey(key))
                val=map.get(key);
            val++;
            map.put(key,val);
        }
        int q=sc.nextInt();
        while(q-->0){
            int in =sc.nextInt();
            System.out.println(map.get(in));
        }
        sc.close();
    }
    
}
