import java.util.Scanner;

public class palindrom {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int count=0,i;
        System.out.println("enter the string\n");
        String inp=s.next();
        int length=inp.length();
        for(i=0;i<=length/2;i++){
            if(inp.charAt(i)==inp.charAt(length-i-1)){
                count++;
            }
        }
        if(count==i){
            System.out.println("palindrome\n");
        }else{
            System.out.println("not palindrome\n");
        }
    }   
}
