package thread.deep;

public class DrawThread extends Thread{
    private Account account;
    //当前线程所希望存款钱数
    private  double drawAmount;
    public DrawThread(Account account, double drawAmount){
        this.account = account;
        this.drawAmount = drawAmount;
    }
    //重复十次存款操作
    public void run(){
        for(int i = 0; i < 10; i++){
            account.draw(drawAmount);
        }
    }
}
