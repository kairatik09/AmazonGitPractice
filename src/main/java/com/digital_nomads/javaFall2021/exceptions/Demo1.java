package com.digital_nomads.javaFall2021.exceptions;


import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Demo1 {
    public static void main(String[] args) {


        try {
            FileWriter myWriter = new FileWriter("filename.txt");
//            Scanner myReader = new Scanner((Readable) myWriter);
//            while(myReader.hasNextLine()){
//
//            }
//            myWriter.write("Files in Java might be tricky, but it is fun enough!");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }finally {
            System.out.println("Finally is ");
        }
    }
}
