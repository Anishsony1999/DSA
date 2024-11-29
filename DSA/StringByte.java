public class StringByte {
    public static void main(String[] args) {
        int n=11;
        System.out.println(hammingWeight(n));
        System.out.println((int)'a');
    }

    public static int hammingWeight(int n) {
        int a=0;
        String s= Integer.toBinaryString(n);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1')a++;
        }
        return a;
    }
}
