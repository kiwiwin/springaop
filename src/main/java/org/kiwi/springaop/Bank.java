package org.kiwi.springaop;

public class Bank {
    public void handleTransfer(Account account, int money) {
        if (account.query() < money) {
            throw new RuntimeException("account balance is not enough");
        }
    }
}
