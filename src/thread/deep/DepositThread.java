package thread.deep;

public class DepositThread extends Thread{
    //模拟用户账户
    private Account account;
    //当前线程所希望存款钱数
    private  double depositAmount;
    public DepositThread(Account account, double depositAmount){
        this.account = account;
        this.depositAmount = depositAmount;
    }
    //重复十次存款操作
    public void run(){
        for(int i = 0; i < 10; i++){
            account.deposite(depositAmount);
        }
    }
}
