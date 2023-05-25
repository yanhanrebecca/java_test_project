package gui;
import java.awt.event.*;
import javax.swing.*;
public class ExampleFrame_05 extends JFrame {
    public static void main(String args[]) {
        new ExampleFrame_05();
    }

    public ExampleFrame_05() {
        this.setTitle("创建菜单栏");
        setBounds(100, 100, 500, 375);

        JMenuBar menuBar = new JMenuBar();// 创建菜单栏对象
        setJMenuBar(menuBar);// 将菜单栏对象添加到窗体的菜单栏中

        JMenu menu = new JMenu("菜单名称(F)");// 创建菜单对象
        menu.setMnemonic('F');// 设置快捷键
        menuBar.add(menu);// 将菜单对象添加到菜单栏对象中

        JMenuItem menuItem = new JMenuItem("菜单项名称");// 创建菜单项对象
        menuItem.addActionListener(new ItemListener());// 为菜单项添加事件监听器
        menu.add(menuItem);// 将菜单项对象添加到菜单对象中
        JMenu sonMenu = new JMenu("子菜单名称");// 创建菜单的子菜单对象
        menu.add(sonMenu);// 将子菜单对象添加到上级菜单对象中

        JMenuItem sonMenuItem = new JMenuItem("子菜单项名称");// 创建子菜单的菜单项对象
        sonMenuItem.addActionListener(new ItemListener());// 为菜单项添加事件监听器
        sonMenu.add(sonMenuItem);// 将子菜单的菜单项对象添加到子菜单对象中
        menu.addSeparator();//加入分割线
        JMenuItem exit = new JMenuItem("退出");// 创建菜单项对象
        exit.addActionListener(new ActionListener(){
            //匿名类 匿名对象技术
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });// 为菜单项添加事件监听器
        menu.add(exit);// 将菜单项对象添加到菜单对象中

        JMenu menu2 = new JMenu("菜单名称2");// 创建菜单对象
        menuBar.add(menu2);// 将菜单对象添加到菜单栏对象中

        JMenuItem menuItem2 = new JMenuItem("菜单项名称2");// 创建菜单项对象
        menuItem2.addActionListener(new ItemListener());// 为菜单项添加事件监听器
        menu2.add(menuItem2);// 将菜单项对象添加到菜单对象中

        //JMenu sonMenu2 = new JMenu("子菜单名称2");// 创建菜单的子菜单对象
        //menu2.add(sonMenu2);// 将子菜单对象添加到上级菜单对象中

        //JMenuItem sonMenuItem2 = new JMenuItem("子菜单项名称2");// 创建子菜单的菜单项对象
        //sonMenuItem2.addActionListener(new ItemListener());// 为菜单项添加事件监听器
        //sonMenu2.add(sonMenuItem2);// 将子菜单的菜单项对象添加到子菜单对象中
        this.setVisible(true);
    }

    private class ItemListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JMenuItem menuItem = (JMenuItem) e.getSource();
            System.out.println("您单击的是菜单项：" + menuItem.getText());
        }
    }

}

