package examination;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(7777);
        while (true) {
            Socket client = server.accept();
            new Thread(new Handler(client)).start();
        }
    }
}

class Handler implements Runnable {
    private Socket client;

    public Handler(Socket client) {
        this.client = client;
    }

    @Override
    public void run() {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
            PrintWriter out = new PrintWriter(client.getOutputStream(), true);

            while (true) {
                String msg = in.readLine();
                if (msg == null) break;

                if (msg.toUpperCase().startsWith("VIP")) {
                    out.println("Vip2022:" + msg);
                } else {
                    out.println("2022:" + msg);
                }
            }

            in.close();
            out.close();
            client.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
