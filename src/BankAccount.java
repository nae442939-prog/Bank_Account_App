public class BankAccount {

    private int balance;
    private String history = "";

    //잔액0
    public BankAccount() {
        this.balance = 0;
    }

    //돈 넣는 (예금)
    public void deposit(int amount) {
        this.balance += amount;
        history += "입금 " + amount + "원\n";
    }

    //돈을 빼는
    public boolean withdraw(int amount) {

        if (this.balance < amount) {
            return false;
        }

        this.balance -= amount;
        history += "출금 " + amount + "원\n";

        return true;
    }

    //거래내역
    public String getHistory() {
        return history;
    }

    //잔액
    public int getBalance() {
        return this.balance;
    }
}