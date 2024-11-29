public class Vov {

    public static void main(String[] args) {

      
        String s = "this is Java Class";
        Vov v = new Vov();
        System.out.println("Count of Vowels in the String: "+v.VCount(s));
        v.VRemove( s);
        v.VPrint(s);
       
        
    }

     int VCount(String s){
        
        int count = 0;
        s=s.toLowerCase();
        char[] ch = s.toCharArray();

        for(int i=0; i<s.length();i++){
            if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'){
                count++;
            }
        }

        return count;
    }

     void VRemove(String s){

        s = s.toLowerCase();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                s=s.replace(s.charAt(i), ' ');
            }
        }
        System.out.println("String with vowels Removed: "+s);
    }
     void VPrint(String s){
        s=s.toLowerCase();
        char[] ch = s.toCharArray();

        System.out.print("Print All vowels in String: ");
        for(int i=0; i<s.length();i++){
            if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'){
                System.out.print(ch[i]+",");
            }
        }
    }
}
