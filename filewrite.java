import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.*;
public class filewrite {
    public static void main(String[] args) {
    try{
        FileWriter f=new FileWriter("hello.txt",true);
        BufferedWriter b=new BufferedWriter(f);
        b.write("\nalimiyan");
        b.close();
        f.close();
    }catch(Exception e){
        e.printStackTrace();
    }
    
    }
}
