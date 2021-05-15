import java.io.*;
public class bytearray{
   public static void main(String[] args){
      File file = new File("hello.txt");
      FileInputStream f = null;
      byte[] b = new byte[(int) file.length()];
      try{
         f = new FileInputStream(file);
         f.read(b);
         f.close();
         for (int i = 0; i < b.length; i++){
            System.out.print((char) b[i]);
         }
        }catch (Exception e){
         e.printStackTrace();
      }
    }
}