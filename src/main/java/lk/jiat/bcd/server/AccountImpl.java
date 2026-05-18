package lk.jiat.bcd.server;

import BankingApp.AccountPOA;
import BankingApp.InsufficientBalance;

import java.util.HashMap;

public class AccountImpl extends AccountPOA {

    private HashMap<String, Double> db = new HashMap<>();

    public AccountImpl() {
        db.put("ACC001",500.00);
        db.put("ACC002",1500.50);
        db.put("ACC003",750.00);
    }

    @Override
    public double getBalance(String accNo) {
        return db.getOrDefault(accNo,0.0);
    }

    @Override
    public void deposit(String accNo, double amount) {

    }

    @Override
    public void withdraw(String accNo, double amount) throws InsufficientBalance {

    }
}
