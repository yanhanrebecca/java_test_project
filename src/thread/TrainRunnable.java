package thread;

public class TrainRunnable implements Runnable{
    Tickets ts = new Tickets();
    public void run(){
        while (true){
            if (ts.getNum() > 0){
                ts.saleTicket();
            }else{
                System.out.println(Thread.currentThread() + ": There is no ticket");
                break;
            }
        }
    }
}
