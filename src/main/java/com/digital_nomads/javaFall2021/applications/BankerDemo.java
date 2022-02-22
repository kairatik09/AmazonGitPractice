package com.digital_nomads.javaFall2021.applications;

import static com.digital_nomads.javaFall2021.applications.Bank.transferFunds;

public class BankerDemo {

    public static void main(String[] args) throws Exception {


        DemirBank nursultanDemirBankAccount = new DemirBank(118000001234l,123456789);
        DemirBank urmatDemirBankAccount = new DemirBank( 118000000312l,987654321);


        nursultanDemirBankAccount.deposit(5000);



        transferFunds(nursultanDemirBankAccount,urmatDemirBankAccount,2000);



        transferFunds(urmatDemirBankAccount,nursultanDemirBankAccount,2101);



    }
}
