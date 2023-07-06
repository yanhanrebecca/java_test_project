package examination;

import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) throws IOException {
        //创建服务器端的 Socket，监听 7777 端口
        ServerSocket serverSocket = new ServerSocket(7777);

        //启动服务器，等待客户端连接
        while (true) {
            Socket socket = serverSocket.accept(); //阻塞式方法，等待客户端连接
            //为每个客户端启动一个线程
            new ClientThread(socket).start();
        }
    }
}

class ClientThread extends Thread {
    private Socket socket;

    public ClientThread(Socket socket) {
        this.socket = socket;
    }

    //处理客户端请求
    public void run() {
        try {
            //获取 I/O 流
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            //循环读取客户端发送的消息,等待客户端发送消息,如果读到的内容为 null，说明客户端已关闭连接，跳出循环
            String line;
            while ((line = in.readLine()) != null) {
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