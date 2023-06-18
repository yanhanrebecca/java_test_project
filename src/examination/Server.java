package examination;
/*
3.使用iavasocket 编程，结合多线程技术，编写服务器端的程序。要求: 服务器端能监听多个客户端的连接(端口号为 7777)，
一旦和客户端连接成功后，能读取客户端的发送过来的信息，并在服务器的本地控制台上输出，如果读取到的信息中以“VIP”字串
开头 (不区分大小写)，那么将读取的信息加上前缀“Vip2022:回发给客户端，否则，将读取到的信息加上前缀“2022:"回发给客
户端。
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(7777);
        while (true) {
            Socket socket = serverSocket.accept();
            new Thread(new ClientHandler(socket)).start();
        }
    }
}

class ClientHandler implements Runnable {
    private Socket socket;

    public ClientHandler(Socket socket) {
        this.socket = socket;
    }

    public void run() {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            while (true) {
                String line = in.readLine();
                if (line == null) break;

                if (line.toUpperCase().startsWith("VIP")) {
                    out.println("Vip2022:" + line);
                } else {
                    out.println("2022:" + line);
                }
            }

            in.close();
            out.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}