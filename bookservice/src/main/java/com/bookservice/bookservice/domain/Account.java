package com.bookservice.bookservice.domain;

import java.math.BigDecimal;
import java.util.Date;

public class Account {
    private String accountName;

    private Date dob;

    private BigDecimal balance;

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal debitAccount(BigDecimal debitAmount){
        return  this.balance.subtract(debitAmount);
    }

    public void creditBalance(BigDecimal creditAmount){
        this.balance=this.balance.add(creditAmount);
    }

    public Account(String accountName, Date dob, BigDecimal balance) {
        this.accountName = accountName;
        this.dob = dob;
        this.balance = balance;
    }
}
