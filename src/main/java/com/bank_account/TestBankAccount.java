package com.bank_account;

public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        bankAccount.addMoney(100);
        bankAccount.showSum();
        bankAccount.withDrawal(400);
        bankAccount.showSum();

        BankAccount bankAccount1 = new BankAccount();
        bankAccount1.addMoney(200);
    }
}
