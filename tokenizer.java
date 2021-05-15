import java.util.*;
class tokenizer{
    public static void main(String[] args) {
        int sum=0;
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the val");
        String s=sc.nextLine();
        StringTokenizer st=new StringTokenizer(s," ");
        while(st.hasMoreTokens()){
            String temp=st.nextToken();
            n=Integer.parseInt(temp);
            System.out.println(n);
            sum=sum+n;
        }
        System.out.println("sum of integers is "+sum);
        sc.close();
    }
    

}