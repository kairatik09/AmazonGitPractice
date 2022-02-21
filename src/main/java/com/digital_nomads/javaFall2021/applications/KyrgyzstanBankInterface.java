package com.digital_nomads.javaFall2021.applications;

public interface KyrgyzstanBankInterface {
    double getBalance();
    void deposit(double amount) throws Exception;
    void withDraw(double amount) throws Exception;
    static void transferWithMbank(KyrgyzstanBankInterface sender,KyrgyzstanBankInterface recipient,double transferAmount) throws Exception {
        sender.withDraw(transferAmount);
        recipient.deposit(transferAmount);


    }
}
