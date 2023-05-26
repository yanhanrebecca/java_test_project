package thread;

public class Tickets {
    private int num = 50;
    public int getNum(){
        return num;
    }
    public synchronized void saleTicket(){
        if(num > 0){
            System.out.println(Thread.currentThread() + " : No." + num + " ticket is sailed");
            try {
                Thread.sleep(5);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            num--;
        }
    }
}
