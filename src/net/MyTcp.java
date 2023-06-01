package net;
import java.io.*;
import java.net.*;
public class MyTcp {
    private BufferedReader reader;
    private PrintWriter writer;
    private ServerSocket server;
    private Socket socket;
    void getserver(){
        try{
            server = new ServerSocket(8998);
            System.out.println("服务套接字已经创建成功");
            while(true){
                System.out.println("等待客户机的连接");
                socket = server.accept();
                System.out.println("客户机连接成功");
                reader = new BufferedReader(new InputStreamReader(socket.getInputStream())); //实例化对象
                writer = new PrintWriter(socket.getOutputStream(), true);//自动flush
                getClientMessage();
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try{
                if(reader != null){
                    reader.close();
                }
                if(writer != null){
                    writer.close();
                }
                if(socket != null){
                    socket.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }

    }
    private void getClientMessage(){
        try{
            while (true){//如果套接字是连接状态
                if (reader.ready()){
                    String s = reader.readLine(); //获得客户端发的消息
                    System.out.println("客户机 " + s); //在本地控制台显示
                    writer.println("Server Received " + s); //发送给客户端
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
            if(reader != null){
                reader.close();
            }
            if(writer != null){
                writer.close();
            }}catch (IOException e){
                e.printStackTrace();
            }
        }
    }
    public static void main(String [] args){
        MyTcp tcp = new MyTcp();
        tcp.getserver();
    }
}
