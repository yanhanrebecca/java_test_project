package thread;

public class run_test implements Runnable{//实现接口方式创建线程
    String s;
    int millis;
    public run_test(String t, int time){
        s = t;
        millis = time;
    }
    public void run(){
        for(int i = 0; i < 10; i++){
            try {
                Thread.sleep(millis);
            }catch (InterruptedException e){}
            System.out.println(s + " have outputed ");
        }
    }
    public static void main(String [] args){
        Runnable ra = new run_test("a", 100);//可以升级为线程，但是现在不是线程
        Runnable rb = new run_test("b", 200);
        Thread a = new Thread(ra);
        Thread b = new Thread(rb);
        a.start();
        b.start();
    }
}
