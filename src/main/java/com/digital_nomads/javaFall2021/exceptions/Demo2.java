package com.digital_nomads.javaFall2021.exceptions;

import java.io.FileWriter;
import java.io.IOException;

public class Demo2 {
    public static void main(String[] args) throws Exception {

//        FileWriter myWriter = new FileWriter("filename.txt");

//        int a [] = new int[4];
//
////        System.out.println(Demo2.test(a));
//
//        throw new Exception("This is my exception");
        int age= 19;
        if(age < 18){
            throw  new Exception("Access denied");
        }else {
            System.out.println("Access granted");
        }
    }

    public static boolean test(int b []) throws Exception{
        int a[] = new int[b.length];
        return false;
    }
}
