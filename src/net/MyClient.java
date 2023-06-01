package net;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import javax.swing.*;
import javax.swing.border.*;
public class MyClient extends JFrame{
    private PrintWriter writer;
    private BufferedReader reader;
    Socket socket;
    private JTextArea ta = new JTextArea();
    private JTextField tf = new JTextField();
    Container cc;
    public MyClient(String title){
        super(title);
        cc = this.getContentPane(); //实例化对象
        final JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBorder(new BevelBorder(BevelBorder.RAISED));
        cc.add(scrollPane, BorderLayout.CENTER);
        scrollPane.setViewportView(ta);
        cc.add(tf, "South");//文本框放在窗体下部
        tf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    writer.println(tf.getText());
                    ta.append(tf.getText() + '\n');
                    ta.append(reader.readLine() + '\n');
                    tf.setText("");//文本框清空
                }catch (IOException ee){
                    ee.printStackTrace();
                }
            }
        });
        this.addWindowListener(new WinAdapt());
        this.setLocation(300, 200);
        this.setSize(200, 200);//设置窗体大小
        this.setVisible(true);//将窗体显示
    }
    private class WinAdapt extends WindowAdapter{
        public void windowClosing(WindowEvent e){
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
            }catch (IOException ee){
                ee.printStackTrace();
            }
        }
    }
    private void connect() throws IOException{ //连接套接字
        ta.append("尝试连接\n");
        try{
            socket = new Socket("127.0.0.1", 9999);
            reader = new BufferedReader(new InputStreamReader(socket.getInputStream())); //实例化对象
            writer = new PrintWriter(socket.getOutputStream(), true);//自动flush
            ta.append("完成连接\n");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String [] args) throws IOException{
        MyClient client = new MyClient("像服务器送数据");
        client.connect();
    }
}
