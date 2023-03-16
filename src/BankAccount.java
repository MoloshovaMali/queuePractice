import java.util.Map;

public class BankAccount {
    private  int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

     void  addBalance(int add){
       this.balance+=add;
    }
    void takeMoney(int take){
        this.balance-=take;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                '}';
    }
}
