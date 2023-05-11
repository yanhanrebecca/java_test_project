package io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class homework {
    public static void main(String [] args) throws IOException {
        BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream("scores3.txt"));
        byte[] bytes = new byte[1024*5];
        int len = 0;
        StringBuilder sb = new StringBuilder();
        while ((len = inputStream.read(bytes))!=-1){
            sb.append(new String(bytes,0,len));
        }
        inputStream.close();
        System.out.println(sb);
    }
}
