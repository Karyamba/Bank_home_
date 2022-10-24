package com.company.classes;

public class Bank {
    String name;
    private int balance;

    public Bank(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    public void setBalance(float balance) {
        this.balance = (int) balance;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
