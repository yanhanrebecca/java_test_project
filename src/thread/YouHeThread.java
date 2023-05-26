package thread;

public class YouHeThread extends Thread{//继承法
    String s;
    int millis;
    YouHeThread(String ss, int mm){
        s = ss;
        millis = mm;
    }
    public void run(){
        try{
            while (true){
                System.out.print(s);
                System.out.flush();
                this.sleep(millis);
            }
        }catch (InterruptedException e){
            return;
        }
    }
    public static void main (String [] args){
        YouHeThread ti = new YouHeThread("你", 25);
        Thread t2 = new YouHeThread("他", 75);
        ti.start();
        t2.start();
    }
}
