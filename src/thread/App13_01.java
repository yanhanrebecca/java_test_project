package thread;
class Ctest extends Thread{
    private String id;
    Ctest(String str){ id = str;}
    public void  run(){//线程体
        for(int i = 0; i < 4; i++){
            for (int j = 0; j < 100000000; j++);//空循环
            System.out.println(id + " is running..... ");
        }
    }
}
public class App13_01 {
    public static void main (String [] args){
        Ctest dog = new Ctest("doggy");
        Ctest cat = new Ctest("kitty");
        dog.start();//启动线程，线程体自动启动
        cat.start();
        System.out.println("212");
    }
}
