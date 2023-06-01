package net;
import java.net.InetAddress;
import java.net.UnknownHostException;
public class Adress {
    public static void main(String [] args){
        InetAddress ip; //创建InetAddress对象
        try{
            ip = InetAddress.getLocalHost();//实例化对象
            String localname = ip.getHostName();
            String localip = ip.getHostAddress();
            System.out.println("本机名 " + localname);
            System.out.println("本机ip " + localip);
        }catch (UnknownHostException e){
            e.printStackTrace();
        }

    }
}
