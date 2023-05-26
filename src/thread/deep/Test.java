package thread.deep;

public class Test {
    public static void main(String [] args){
        Account acct = new Account(100);
        new DrawThread(acct, 800).start();
        new DepositThread(acct, 800).start();
    }
}
