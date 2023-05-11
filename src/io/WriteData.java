package io;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
public class WriteData {
    public static void main(String [] args) throws FileNotFoundException {
        File f = new File("scores3.txt");
        if (f.exists()){
            f.delete();
        }
        try(PrintWriter p = new PrintWriter(f);){
            p.print("john T smith ");
            p.println(90);
            p.println("Eric L Jones ");
            p.println(85);

        }
        System.out.println("End.");
    }
}
