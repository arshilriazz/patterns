package patterns.facade;

public class Facade {
    int acctNumber;
    int amountToWithdraw;
    AccountNumber accountNumber;
    FundCheck fundCheck;
    public Facade(int acctNumber, int amount) {
        this.acctNumber = acctNumber;
        this.amountToWithdraw = amount;
        this.accountNumber = new AccountNumber();
        this.fundCheck = new FundCheck();
    }
    public void canIWithdraw() {
        if(fundCheck.checkAmount(amountToWithdraw) && accountNumber.isValidAccountNumber(acctNumber))
            System.out.println("You can withdraw");
        else
            System.out.println("you cannot withdraw");
    }
}
