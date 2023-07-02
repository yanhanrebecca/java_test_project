package examination;

import java.io.*;
import java.net.*;

/*
使用javasocket 编程，结合多线程技术，编写服务器端的程序。要求: 服务器端能监听多个客户端的连接(端口号为 7777)，
一旦和客户端连接成功后，能读取客户端的发送过来的信息，并在服务器的本地控制台上输出，如果读取到的信息中以“VIP”字
串开头 (不区分大小写)，那么将读取的信息加上前缀“Vip2022:回发给客户端，否则，将读取到的信息加上前缀”2022:
"回发给客户端。“

 */
public class Server {
    public static void main(String[] args) throws IOException {
        //创建服务器端的 Socket，监听 7777 端口
        ServerSocket serverSocket = new ServerSocket(7777);

        //启动服务器，等待客户端连接
        while (true) {
            Socket socket = serverSocket.accept(); //阻塞式方法，等待客户端连接
            //为每个客户端启动一个线程
            new Thread(new ClientThread(socket)).start();
        }
    }
}

class ClientThread implements Runnable {
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