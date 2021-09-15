package com.iostream;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

 

public class CopyFileDemo {
    
    public static void main(String ar[]) throws IOException {

        FileReader in = new FileReader("D:/abc.txt");
        FileWriter out = null;


        try {
        
            out = new FileWriter("D:/lavi.txt");// output


            int c;
            while ((c = in.read())!=-1) {

                out.write(c);                            // output will generate on file instead of console

            }

            
            System.out.println("Done....");

 

        } catch (Exception e) {

            e.printStackTrace();
        }

        finally {

            in.close();
            out.close();
        }

    }


}