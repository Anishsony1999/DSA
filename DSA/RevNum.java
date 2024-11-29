public class RevNum {
    public static void main(String[] args) {
        int m =-21;
        int ans=0;
        int mul=1;

        if(m<0) mul=-1;
        m= Math.abs(m);
        while(m>0){ 
            int temp = m%10; 
            ans = ans*10+temp;  
            m=m/10;  
        }
        System.out.println(ans*mul);
    }
}
