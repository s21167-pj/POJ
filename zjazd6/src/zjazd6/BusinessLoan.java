package zjazd6;

/*
    Author: Marcel Pankanin  
    BusinessLoan class implemented in Java
    Date: 18.05.2020
*/
public class BusinessLoan extends Loan {
    BusinessLoan(int loanNumber, String customerName, double loanAmount, int term,
                 double primeInterestRate) {
        super(loanNumber, customerName, loanAmount, term);
        super.interestRate = primeInterestRate * 1.01;
    }
}
