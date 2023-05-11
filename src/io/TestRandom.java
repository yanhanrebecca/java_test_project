package io;
import java.io.IOException;
import java.io.RandomAccessFile;
public class TestRandom {
    public static void main(String [] args) throws IOException{//随机读写二进制文件
        RandomAccessFile input = new RandomAccessFile("input.dat", "rw");
        try {
            input.setLength(0); //文件内容清零
            for(int i = 1; i <= 200; i++)
                input.writeInt(i);//一个int  4个字节
                System.out.println("Current file length is " + input.length());
                input.seek(0);//回到文件头
                System.out.println("The first number is " + input.readInt());
                System.out.println("The x number is " + input.readInt());
                input.seek(9*4);//二进制文件，将指针移动到第10个数字上
                System.out.println("The tenth number is " + input.readInt());
                input.writeInt(555);
                input.seek(input.length());//移动到文件最后
                input.writeInt(999);
                System.out.println("The new file length is " + input.length());
                input.seek(10*4);
                System.out.println("The eleventh number is " + input.readInt());
        }
        finally {
            input.close();
        }
    }
}
