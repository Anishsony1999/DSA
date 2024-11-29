public class StringToNumber {
    public static void main(String[] args) {
        String s  = "123456789";
        String s1 = "987654321";

        StringBuffer ans = new StringBuffer();

        int x = 0;
        int y = 0 ;
        for(char i : s.toCharArray()){
            int n = i - 48;
            x = x*10 + n;
        }
        for(char i : s1.toCharArray()){
            int n = i - 48;
            y = y*10 + n;
        }

        int z = x*y;
        System.out.println(z);
        while(z>0){
            int temp = z %10;
            ans.append((char) ('0'+temp));
            z = z/10;
        }

        System.err.println(ans);
        
    }
}
