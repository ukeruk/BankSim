import java.time.LocalDateTime;

public class Transaction {
    double transAmount; // The increase/decrease of balance
    double balancePreTrans; // The balance before the transaction
    double newBalance;
    LocalDateTime currentDate;

    public Transaction(double balance, double transaction){
        this.transAmount = transaction;
        this.balancePreTrans = balance;
        this.newBalance = balance + transaction;
        this.currentDate = LocalDateTime.now();
    }

    public double getTransAmount() {
        return transAmount;
    }

    public double getBalancePreTrans() {
        return balancePreTrans;
    }

    public double getNewBalance() {
        return newBalance;
    }
}
