package examination;

import java.io.*;
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.PrintWriter;
import java.net.*;
//import java.net.ServerSocket;
//import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        //创建服务器端的 Socket，监听 7777 端口
        ServerSocket serverSocket = new ServerSocket(7777);

        //启动服务器，等待客户端连接
        while (true) {
            Socket socket = serverSocket.accept(); //阻塞式方法，等待客户端连接
            //为每个客户端启动一个线程
            new Thread(new ClientHandler(socket)).start();
        }
    }
}

class ClientHandler implements Runnable {
    private Socket socket;

    public ClientHandler(Socket socket) {
        this.socket = socket;
    }

    //处理客户端请求
    public void run() {
        try {
            //获取 I/O 流
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            //循环读取客户端发送的消息
            while (true) {
                String line = in.readLine(); //阻塞式方法，等待客户端发送消息
                if (line == null) break; //如果读到的内容为 null，说明客户端已关闭连接，跳出循环

                //根据消息内容进行处理，并回复客户端
                if (line.toUpperCase().startsWith("VIP")) { //如果读到的内容以 "VIP" 开头（不区分大小写）
                    out.println("Vip2022:" + line); //加上前缀 "Vip2022:"，回复客户端
                } else { //否则
                    out.println("2022:" + line); //加上前缀 "2022:"，回复客户端
                }
            }

            //关闭 I/O 流和客户端 Socket
            in.close();
            out.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}