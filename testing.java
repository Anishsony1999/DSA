import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class testing {
    public static void main(String[] args) throws IOException{
       
        String[][] arr = {
            {
                "name","age","marks"
            },
            {
                "Anish","22","60"
            },
            {
                "frank","22","90"
            },
            {
                "ayana","23","85"
            }
        };

        File fi = new File("out.csv");
        FileWriter fr = new FileWriter(fi);

        for(String[] data : arr){
            StringBuilder sb = new StringBuilder(); 

            for(int i = 0 ; i<data.length;i++){
            sb.append(data[i]);
                if(i!=data.length-1){
                    sb.append(",");
                }
            }

            fr.write("\n"+sb.toString());
        }
        
        fr.close();
    }
}
