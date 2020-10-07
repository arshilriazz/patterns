package patterns.facade;

public class AccountNumber {
    int accountNumber = 4521;
    public boolean isValidAccountNumber(int accountNumber) {
        if(this.accountNumber == accountNumber) return true;
        return false;
    }
}
