package com.kienast.concurrency;

import static com.kienast.concurrency.ThreadColor.ANSI_GREEN;
import static com.kienast.concurrency.ThreadColor.ANSI_RED;

public class Challenge1Main {

    public static void main(String[] args) {
        final BankAccount bankAccount = new BankAccount(1000.00, "12345-678");

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(ANSI_GREEN + "Current balance: " + bankAccount.getBalance());
                System.out.println(ANSI_GREEN + "Depositing 300.00");
                bankAccount.deposit(300.00);
                System.out.println(ANSI_GREEN + "Current balance: " + bankAccount.getBalance());
                System.out.println(ANSI_GREEN + "Withdrawing 50.00");
                bankAccount.withdraw(50.00);
                System.out.println(ANSI_GREEN + "Current balance: " + bankAccount.getBalance());
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(ANSI_RED + "Current balance: " + bankAccount.getBalance());
                System.out.println(ANSI_RED + "Depositing 203.75");
                bankAccount.deposit(203.75);
                System.out.println(ANSI_RED + "Current balance: " + bankAccount.getBalance());
                System.out.println(ANSI_RED + "Withdrawing 100.00");
                bankAccount.withdraw(100.00);
                System.out.println(ANSI_RED + "Current balance: " + bankAccount.getBalance());
            }
        });

        t1.start();
        t2.start();
    }

}
