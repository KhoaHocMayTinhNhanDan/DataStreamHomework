/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastreamhomework;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author hoang
 */
public class DataStreamHomework {
    int[][] c = new int[5][10000];
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
 //      readFile("C:\\Users\\hoang\\Downloads\\HW4-q4\\words_stream.txt");
//        readFile("C:\\Users\\hoang\\Downloads\\HW4-q4\\words_stream_tiny.txt");

        System.out.println(hash_fun(1, 88));
        System.out.println(hash_fun(1, 17));
        System.out.println(hash_fun(1, 38));
        System.out.println(hash_fun(1, 4));
        System.out.println(hash_fun(1, 5));
    }

//    Returns hash(x) for hash function given by parameters a, b, p and n_buckets
    public static int hash_fun(int index, int x) {
//        Returns hash(x) for hash function given by parameters a, b, p 
//        and n_buckets

        int p = 123457;
        int n_buckets = 10000;
        int y = x % p;
        int a = 0;
        int b = 0;
        switch (index) {
            case 1:
                a = 3;
                b = 1561;
                break;
            case 2:
                a = 17;
                b = 277;
                break;
            case 3:
                a = 38;
                b = 394;
                break;
            case 4:
                a = 61;
                b = 13;
                break;
            case 5:
                a = 78;
                b = 246;
        }

        int hash_val = (a * y + b) % p;
        return hash_val % n_buckets;
    }

    public static void readFile(String fileName) throws FileNotFoundException,
            IOException {
        FileReader file = new FileReader(fileName);
        BufferedReader br = new BufferedReader(file);
        String textLine;
        while ((textLine = br.readLine()) != null) {
            System.out.println(textLine);
        }
        br.close();
    }
}
