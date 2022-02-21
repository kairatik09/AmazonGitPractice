package com.digital_nomads.javaFall2021.applications;

import com.digital_nomads.javaFall2021.applications.KyrgyzstanBankInterface;

public abstract class KyrgyzstanBankAbstract implements KyrgyzstanBankInterface {
    private String phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public KyrgyzstanBankAbstract(String phoneNumber) {

        if(phoneNumber.length() != 13  || !phoneNumber.startsWith("+")){
            System.err.println("Invalid phone number");
        }else {
            this.phoneNumber = phoneNumber;
        }

    }
}
