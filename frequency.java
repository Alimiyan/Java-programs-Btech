import java.util.Scanner;

public class frequency {
 public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
     int count=0;
     System.out.println("enter the string");
     String inp=s.next();
     System.out.println("enter the char");
     char ch=s.next().charAt(0);
     int l=inp.length();
     for(int i=0;i<l;i++){
         if(ch==inp.charAt(i)){
             count++;
         }
     }
     System.out.println("No of char"+ch+"="+count);
 }   
}
