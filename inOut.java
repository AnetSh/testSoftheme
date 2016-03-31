package curse;

import java.io.*;

/**
 * Created by IntelliJ IDEA.
 * User: Anet
 * Date: 31.03.16
 * Time: 13:36
 * To change this template use File | Settings | File Templates.
 */
public class inOut {
    public static int readNumber(){
        int k=0;
        try{
            DataInputStream file = new DataInputStream(new FileInputStream("INPUT.txt")) ;
            while (file.available()>0) {
                int number = file.readInt();
                if(number==1){
                    k++;
                }
            }
        }
        catch(IOException ex){
            System.out.print(ex.getMessage());
        }
        return k;
    }

    public static void writeNumber(int number){
        try{
            DataOutputStream file = new DataOutputStream(new FileOutputStream("OUTPUT.txt"));
            System.out.print(number);
            file.writeInt(number);
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    public static void main(String[] args) {
        int quantity;
        GenerateFile.generateFile();
        quantity=readNumber();
        writeNumber(quantity);
    }
}
