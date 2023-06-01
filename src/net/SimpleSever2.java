package net;
//期末考试考
import java.net.*;
import java.io.*;
public class SimpleSever2 {
    public static final int SERVERPORT = 9999;
    public static void main(String [] args){
        try{
            ServerSocket s = new ServerSocket(SERVERPORT);
            System.out.println("SERVER STARTED!");
            int number = 1;
            while(true){
                Socket incoming = s.accept();
                System.out.println(" Connect " + number + "accepted: ");
                //EchoTHread t = new EchoTHread(incoming, number);
                //t.start();
                new EchoTHread(incoming, number).start();
                number++;
            }
        }catch (IOException e){
            System.out.println("IOException");
        }
    }
}
class EchoTHread extends Thread{
    private Socket s;
    private int counter;
    public EchoTHread(Socket i, int c){
        s = i;
        counter = c;
    }
    public void run(){//线程
        try{
            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream())); //实例化对象
            PrintWriter out = new PrintWriter(s.getOutputStream(), true);//自动flush
            out.println("hello! Enter BYE to exit.");
            while(true){
                String line = in.readLine();
                if(line.trim().equals("")) continue;
                if(line.trim().equalsIgnoreCase("BYE")) break; //如果用户输入BYE就将结束会话
                else{
                    System.out.println("Echo " + counter + " : " + line);
                    out.println("Receive: " + line);
                }
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
