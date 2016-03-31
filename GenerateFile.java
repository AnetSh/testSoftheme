package curse;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: Anet
 * Date: 31.03.16
 * Time: 13:26
 * To change this template use File | Settings | File Templates.
 */
public class GenerateFile {
    public static void generateFile(){
        try{
            DataOutputStream file = new DataOutputStream(new FileOutputStream("INPUT.txt"));
            int length=(int)(Math.random()*(100-1));
            for(int i=0;i<length;i++){
                int number=(int)(Math.random()*2);
                file.writeInt(number);
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
