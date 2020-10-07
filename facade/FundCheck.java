package patterns.facade;

public class FundCheck {
    int amount = 1000;
    public boolean checkAmount(int amount) {
        if(this.amount > amount) return true;
        else return false;
    }
}
