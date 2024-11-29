public class AddBinary {
    
    public String addBinary(String a, String b) {
        
        int x=0;
        int y=0;
        int p=0;
        for(int i=a.length()-1; i>=0 ; i--){
            if(a.charAt(i) == '1'){
                x =x+(int) Math.pow(2,p);
            }
            p++;
        }

        p=0;
        for(int i=b.length()-1; i>=0 ; i--){
            if(b.charAt(i) == '1'){
                y =y+(int) Math.pow(2,p);
            }
            p++;
        }

        int ans = x + y;
        if(ans == 0 ) return "0";
        int index = 0;
        int[] arr = new int[35];
        while(ans != 0 ){
            int temp = ans % 2;
            ans = ans / 2;
            arr[index++] = temp;
        }

        StringBuilder sb = new StringBuilder();
        for(int i = index-1 ; i>=0 ; i--){
            if(arr[i]==1)sb.append("1");
            else sb.append("0");
        }

        return sb.toString();
    }
    
}
