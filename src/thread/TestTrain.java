package thread;

public class TestTrain {
    public static void main(String [] args){
        TrainRunnable t = new TrainRunnable();
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        Thread t3 = new Thread(t);
        t1.start();
        t2.start();
        t3.start();
    }
}
