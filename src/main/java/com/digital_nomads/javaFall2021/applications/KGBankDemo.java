package com.digital_nomads.javaFall2021.applications;

import com.digital_nomads.javaFall2021.applications.KyrgyzstanBank;

import static com.digital_nomads.javaFall2021.applications.KyrgyzstanBankInterface.*;
public class KGBankDemo {
    public static void main(String[] args) throws Exception {
        KyrgyzstanBank nursultanKyrgyzBancAccount = new KyrgyzstanBank("+996555444333");
        KyrgyzstanBank aidarKyrgyzBankAccount = new KyrgyzstanBank("+996777444333");
        nursultanKyrgyzBancAccount.deposit(100000);
        transferWithMbank(nursultanKyrgyzBancAccount,aidarKyrgyzBankAccount,10000);
        System.out.println("Nursultan's balance: " + nursultanKyrgyzBancAccount.getBalance());
        System.out.println("Aidar's balance: " + aidarKyrgyzBankAccount.getBalance());
        System.out.println("Nursultan's phone: " + nursultanKyrgyzBancAccount.getPhoneNumber());
        System.out.println("Aidar's phone: " + aidarKyrgyzBankAccount.getPhoneNumber());

    }
}
