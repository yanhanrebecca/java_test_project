package gui;
import	java.awt.*;
import	java.awt.event.*;
import	javax.swing.*;
public	class	TestDialog{
    public	static	void	main(String	args[]){
        MyDialog md=new MyDialog();
    }
}
class MyDialog extends JFrame implements ActionListener{
    JDialog dialog1,dialog2;
    JButton bt1,bt2,bt3,btY1,btY2;
    JTextField input=new JTextField("请输入信息",30);
    MyDialog(){
        super("测试对话框");
        bt1=new JButton("模式对话框");
        bt2=new JButton("非模式对话框");
        bt3=new JButton("关闭");
        btY1=new JButton("确定");
        btY2=new JButton("确定");
        Container	c=this.getContentPane();
        c.setLayout(new FlowLayout());
        c.add(input);
        c.add(bt1);
        c.add(bt2);
        c.add(bt3);
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        bt3.addActionListener(this);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new WinAdapt());
        setSize(400,100);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getActionCommand()=="模式对话框"){
            dialog1=new JDialog(this,"这是一个模式对话框",true);
            JPanel p1=new JPanel();
            JPanel p2=new JPanel();
            p1.add(new JLabel("您输入的是:"+this.input.getText()));
            dialog1.getContentPane().add("North",p1);
            p2.add(btY1);
            btY1.addActionListener(this);
            btY1.setActionCommand("bty1");
            dialog1.getContentPane().add("South",p2);
            dialog1.setSize(400,200);
            dialog1.setVisible(true);
        }
        if(e.getActionCommand()=="bty1") dialog1.dispose();
        if(e.getActionCommand()=="非模式对话框"){
            dialog2=new JDialog(this,"非模式对话框",false);
            JPanel p3=new JPanel();
            JPanel p4=new JPanel();
            p3.add(new JLabel("这是一个非模式对话框,您可以再创建一个模式对话框"));
            p4.add(btY2);
            dialog2.getContentPane().add("North",p3);
            btY2.addActionListener(this);
            btY2.setActionCommand("bty2");
            dialog2.getContentPane().add("South",p4);
            dialog2.setSize(400,200);
            dialog2.setVisible(true);
        }
        if(e.getActionCommand()=="bty2") dialog2.dispose();
        if(e.getActionCommand()=="关闭") {
            this.dispose();
            System.exit(0);
        }
    }
}
class WinAdapt extends WindowAdapter{
    public void windowClosing(WindowEvent e){
        //e.getWindow().dispose();
        //System.exit(0);
        int	selection=JOptionPane.showConfirmDialog(
                e.getWindow(),"Are	you	sure?","Logout",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.WARNING_MESSAGE
        );
        if	(selection==JOptionPane.OK_OPTION){
            System.exit(0);
        }
    }
}