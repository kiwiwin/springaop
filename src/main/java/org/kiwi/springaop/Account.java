package org.kiwi.springaop;

public class Account {
    private int balance;

    public Account() {
    }

    public Account(int balance) {
        this.balance = balance;
    }

    public void transfer(Account account, int money) {
        rollOut(money);
        account.rollIn(money);
    }

    public void rollOut(int money) {
        this.balance -= money;
    }

    public void rollIn(int money) {
        this.balance += money;
    }

    public int query() {
        return balance;
    }
}
