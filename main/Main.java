package com.wipro.bank.main;

import java.util.Scanner;
import com.wipro.bank.acc.RDAccount;
import com.wipro.bank.exception.BankValidationException;
import com.wipro.bank.service.BankService;

public class Main {

    public static void main(String[] args) throws BankValidationException {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Monthly Deposit: ");
        float principal = sc.nextFloat();

        System.out.print("Enter Tenure (5 or 10): ");
        int tenure = sc.nextInt();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Gender (Male/Female): ");
        String gender = sc.next();

        BankService service = new BankService();

            if (service.validateData(principal, tenure, age, gender)) {

                RDAccount rd = new RDAccount(tenure, principal);

                rd.setInterest(age, gender);

                float totalDeposit = rd.calculateAmountDeposited();

                float interest = rd.calculateInterest();

                float maturityAmount =
                        rd.calculateMaturityAmount(totalDeposit, interest);

                System.out.println("\nTotal Deposit : " + totalDeposit);
                System.out.println("Interest      : " + interest);
                System.out.println("Maturity Amt  : " + maturityAmount);
            }

        
        sc.close();
    }
}