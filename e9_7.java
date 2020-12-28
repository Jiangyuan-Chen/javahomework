import java.util.Date;

public class e9_7 {
    public static void main(String[] args){
        Account account = new Account(1122, 20000);// 创建一个账户对象
        account.setAnnualInterestRate(4.5);// 设置年利率

        //对账户存取款
        account.withDraw(2500);
        account.deposit(3000);

        System.out.println("Balance: " + account.getBalance() + "\n"
                + "Monthly Interest Rate: " + account.getMonthlyInterestRate() + "\n"
                + "Date Created: " + account.getDateCreated());
    }
}

class Account{
    private int id = 0;
    private double balance = 0;
    private static double annualInterestRate = 0;
    private Date dateCreated;

    public Account(){
        dateCreated = new Date();
    }

    public Account(int id, double balance){
        dateCreated = new Date();
        this.id = id;
        this.balance = balance;
    }

    public int getId(){
        return id;
    }

    public double getBalance(){
        return balance;
    }

    public double getAnnualInterestRate(){
        return annualInterestRate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate() {
        double monthlyInterestRate = annualInterestRate / 12;
        return balance * monthlyInterestRate / 100;
    }

    public void withDraw(double money){
        balance -= money;
    }

    public void deposit(double money) {
        balance += money;
    }
}


