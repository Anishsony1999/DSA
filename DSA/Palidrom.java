public class Palidrom {
    public static void main(String[] args) {
        String s ="Malayalam";

        if(pali2(s)) System.out.println("This is Palidrom");
        else System.out.println("This is not a Palidrom");
    }

    static boolean pali(String s){
        int length = s.length();
        s.toLowerCase();
        String reverse="";

        for(int i=length-1; i>=0;i--){
            reverse = reverse+s.charAt(i);
        }
        if(s.equals(reverse))
        return true;
        else return false;
    }

    static boolean pali2(String s){
        s=s.toLowerCase();
        int i=0,j=s.length()-1;
        boolean ans =true;
        while (i<j) {
            if(s.charAt(i)!=s.charAt(j)){
                ans=false;
                break;
            } 
            i++;
            j--;
        }
        return ans;
    }
}
