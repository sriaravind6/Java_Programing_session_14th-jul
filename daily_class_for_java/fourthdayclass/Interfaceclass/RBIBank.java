package daily_class_for_java.fourthdayclass.Interfaceclass;

public interface RBIBank {
    void savingsAccount();
    void currentAccount();
    void fixedDeposit();
    default void savingsAccountIntrestRate(){
        System.out.println("Default Interest Rate for Savings Account is 4%");
    }
    default void homeLoanInterestRate() {
        System.out.println("Default Interest Rate for Home Loan is 8%");
    }
    static void personalLoanInterestRate() {
        System.out.println("Default Interest Rate for Personal Loan is 12%");
    }
}
