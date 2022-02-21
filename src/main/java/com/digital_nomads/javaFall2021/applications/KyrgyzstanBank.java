package com.digital_nomads.javaFall2021.applications;

import com.digital_nomads.javaFall2021.applications.KyrgyzstanBankAbstract;

public class KyrgyzstanBank extends KyrgyzstanBankAbstract {

    private double balance = 0;

    public KyrgyzstanBank(String phoneNumber) {
        super(phoneNumber);
    }


    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void deposit(double amount) throws Exception {
        if(amount < 0 || amount > 100000){
            throw new Exception("Invalid amount");
        }else {
            balance +=amount;
        }

    }

    @Override
    public void withDraw(double amount) throws Exception {
        if(amount < 0 || amount > 40000){
                throw new Exception("Invalid amount,can not be withdrawn");
            }
            else {
                if(balance < amount){
                    throw new Exception("Insufficient funds");
                }
                else {
                    balance -= amount;
                }
            }

    }
}
