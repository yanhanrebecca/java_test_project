package io;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class ReadData {
    public static void main(String [] args) throws IOException{
        File f = new File("scores3.txt");
        if(f.exists() == false){
            System.out.println("File is not exits.");
            System.exit(1);
        }
        Scanner r = new Scanner(f);
        while (r.hasNext()){
            String firstName = r.next();
            String mi = r.next();
            String lastName = r.next();
            int score = r.nextInt();
            System.out.println(firstName + " " + mi + " " + lastName + " " + score);

        }
        r.close();
    }
}
