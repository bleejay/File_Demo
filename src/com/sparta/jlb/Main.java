package com.sparta.jlb;

import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        try {
            File myFile = new File("resources/test.txt");
            OutputStream outputStream = new FileOutputStream(myFile);
            outputStream.write(new byte[]{'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd'});
            System.out.println(myFile.length());
            readFile(myFile);
            getFiles("resources");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFile(File myFile){
        try {
            Reader reader = new FileReader(myFile);
            char [] chars = new char[(int) myFile.length()];
            reader.read(chars);
            System.out.println(Arrays.toString(chars));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void getFiles(String PATH){
        File file = new File(PATH);
        String[] names = file.list();
        System.out.println(Arrays.toString(names));

    }
}
