package com.bank_account;

public class BankAccount {
    private int sum;

    public BankAccount() {
        sum = 200;
    }

    // access_modificator void(or return type) name_of_method(incoming params or absent);
    public void addMoney(int value) {
        sum += value;
    }

    public void withDrawal(int value) {
        if (sum >= value) {
            sum -= value;
        } else {
            System.out.println("Add money");
        }
    }

    public void showSum() {
        System.out.println("Summa = " + sum);
    }
}
