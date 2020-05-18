package zjazd6;

/*
    Author: Marcel Pankanin  
    PersonalLoan class implemented in Java
    Date: 18.05.2020
*/
public class PersonalLoan extends Loan {
    PersonalLoan(int loanNumber, String customerName, double loanAmount, int term,
                 double primeInterestRate) {
        super(loanNumber, customerName, loanAmount, term);
        super.interestRate = primeInterestRate * 1.02;
    }
}
