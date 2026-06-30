package com.wipro.bank.acc;

public class RDAccount extends Account {

    public RDAccount(int tenure, float principal) {
        this.tenure = tenure;
        this.principal = principal;
    }
    public float calculateAmountDeposited() {
        return principal * tenure * 12;
    }
    public float calculateInterest() {

        float totalDeposit = calculateAmountDeposited();

        float interest = (totalDeposit * rateOfInterest * tenure) / 100;

        return interest;
    }
}