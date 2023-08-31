import java.util.ArrayList;

public class Account {
    private String name;
    private double balance; // in dollars
    private ArrayList<Transaction> transactionList;

    public Account(String name) {
        this.name = name;
        this.balance = 0;
        this.transactionList = new ArrayList<>();
    }

    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
        this.transactionList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void doTransaction(double trans) {
        this.transactionList.add(new Transaction(this.balance, trans));
        this.balance += trans;
    }
}
