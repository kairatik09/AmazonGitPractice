package com.digital_nomads.javaFall2021.exceptions;

public class Exceptions extends Throwable {
    public static void main(String[] args) {

       try {
           int a [] = new int[3];
           System.out.println(a[4]);
           System.out.println("Hello world");
       }catch (ArrayIndexOutOfBoundsException e){
           e.printStackTrace();
       }
    }
}
