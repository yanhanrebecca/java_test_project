package examination;

public class ThreadTest {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println("您好");
                    try {
                        Thread.sleep(25);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        Thread s = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println("他好");
                    try {
                        Thread.sleep(75);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        for (int i = 0; i < 15; i++) {
            System.out.println("大家好");
        }

        t.start();
        s.start();
    }
}
