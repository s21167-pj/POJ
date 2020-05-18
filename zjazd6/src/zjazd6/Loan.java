package zjazd6;

import java.util.InputMismatchException;

/*
    Author: Marcel Pankanin  
    Loan class implemented in Java
    Date: 18.05.2020
*/
public abstract class Loan implements LoanConstants {
    protected double interestRate;
    private int loanNumber;
    private String customerName;
    private double loanAmount;
    private int term;

    public Loan(int loanNumber, String customerName, double loanAmount, int term) {
        this.loanNumber = loanNumber;
        this.customerName = customerName;

        try {
            if (loanAmount > MAXAMOUNT || loanAmount < 1) {
                throw (new InputMismatchException("Loan amount is wrong"));
            } else {
                this.loanAmount = loanAmount;
            }
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }

        if (term != SHORTTERM && term != MEDIUMTERM && term != LONGTERM) {
            this.term = SHORTTERM;
        } else this.term = term;
    }

    public static void main(String[] args) {

    }

    @Override
    public String toString() {
        return "Loan{" +
                "loanNumber=" + loanNumber +
                ", customerName='" + customerName + '\'' +
                ", loanAmount=" + (loanAmount + (loanAmount * (interestRate / 100))) +
                ", interestRate=" + interestRate +
                ", term=" + term +
                '}';
    }
}
