import java.io.*;
public class fileinput {
    public static void main(String[] args) {
        int c;
        FileInputStream fi=null;
        try{
            fi=new FileInputStream("hello.txt");
            c=fi.read();
            do{
                System.out.println((char)c);
            }while(c!=-1);
            fi.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
}
