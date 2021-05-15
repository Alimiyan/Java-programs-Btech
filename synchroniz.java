class callme{
    String msg;
    synchronized void call(String str) {
        msg=str;
        System.out.print("["+msg);
        try{
            Thread.sleep(1000);
        }catch(Exception e){
            e.printStackTrace();
        }
    System.out.println("]");
    }
 }
class caller implements Runnable{
    String msg;
    callme target;
    Thread t;
    public caller(callme tar,String s){
        target=tar;
        msg=s;  
        t=new Thread(this);
        t.start();
    }
        public void run(){
            target.call(msg);
        }
}
class synch{
    public static void main(String[] args) {
        callme target=new callme();
        caller ob1=new caller(target,"hello");
        caller ob2=new caller(target,"world");
        caller ob3=new caller(target,"ok");
        try{
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
}