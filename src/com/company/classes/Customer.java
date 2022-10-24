package com.company.classes;

public class Customer extends Human{
    private int balance;
    private int  accID;

    public Customer(String firstName, String lastName, int age, int documentId,
                    int balance, int accID) {
        super(firstName, lastName, age, documentId);
        this.balance = balance;
        this.accID = accID;

    }

    public int getBalance() {
        return balance;
    }

    public int getAccID() {
        return accID;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setAccID(int accID) {
        this.accID = accID;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "balance=" + balance +
                ", accID=" + accID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", documentId=" + documentId +
                '}';
    }
}
