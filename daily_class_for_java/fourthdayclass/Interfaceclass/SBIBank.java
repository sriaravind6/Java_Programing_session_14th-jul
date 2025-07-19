package daily_class_for_java.fourthdayclass.Interfaceclass;

public class SBIBank implements RBIBank {


    public void savingsAccount() {
        System.out.println("SBI Bank Savings Account");
    }


    public void currentAccount() {
        System.out.println("SBI Bank Current Account");
    }


    public void fixedDeposit() {
        System.out.println("SBI Bank Fixed Deposit");
    }

    public void savingsAccountIntrestRate(){
        System.out.println("Default Interest Rate for Savings Account is 6%");
    }


    public void homeLoanInterestRate() {
        System.out.println("Default Interest Rate for Home Loan is 7%");
    }

    public void personalLoanInterestRate() {
        System.out.println("Default Interest Rate for Personal Loan is 10%");
    }
}
