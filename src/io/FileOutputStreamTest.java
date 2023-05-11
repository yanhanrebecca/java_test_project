package io;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {
    public static void main(String [] args) throws IOException{
        FileOutputStream fo = null;
        try{
            fo = new FileOutputStream("FileOutputStreamTest_file.txt");
            fo.write(65);
            fo.write(new byte[] {'1', '2', '3'});
            byte b[] = {'\r', '\n', 'o', 'k'};
            fo.write(b);

        }
        finally {
            fo.close();
        }
    }
}
