import java.util.*;
public class thrdprgrm extends Thread{
    
public void run(){
       while(true){
        int num=new Random().nextInt(10);
        if(num%2==0){
            new square(num).start();
        }else{
            new cube(num).start();
        }
        try{
            Thread.sleep(1500);
        }
        catch(Exception e){
            e.printStackTrace();
        }
       }
}
}
class square extends Thread{
    int n;
    public square(int num){
        n=num;
    }
    public void run(){
        System.out.println("the square of "+n+" is "+ n*n);
    }
}

class cube extends Thread{
    int n;
    public cube(int num){
        n=num;
    }
    public void run(){
        System.out.println("the cube of "+n+" is "+ n*n*n);
    }
}
class trial{
    public static void main(String[] args) {
            thrdprgrm th=new thrdprgrm();
            th.start();
    }    
}
