package com.wipro.bank.service;

import com.wipro.bank.exception.BankValidationException;

public class BankService {

    public boolean validateData(float principal, int tenure, int age, String gender)
            throws BankValidationException {
try {
        if (principal >= 500 &&
                (tenure == 5 || tenure == 10) &&
                age <= 100 &&
                (gender.equalsIgnoreCase("Male") ||
                 gender.equalsIgnoreCase("Female"))) {

            return true;
        }

        else {
        throw new BankValidationException("Invalid Input");
        }
}
        catch (BankValidationException e) {
            System.out.println(e.getMessage());
            return false;
        }
}
}