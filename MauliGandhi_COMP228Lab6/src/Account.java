public class Account {
    private double balance;

    public Account(double balance)
    {
        this.balance = balance; // Setting initial balance
    }
    public synchronized void deposit(double amount)
    {
        if(amount<0)
        {
            System.out.println(Thread.currentThread().getName() + " Deposit amount can not be negative");
        }
        else
        {
            balance += amount;
            System.out.println(Thread.currentThread().getName() + " Amount deposited: " + amount);
            System.out.println(Thread.currentThread().getName() + " Current Balance: " + balance);
        }
    }
    public synchronized void withdraw(double amount)
    {
        if(amount<0)
        {
            System.out.println(Thread.currentThread().getName() + " Withdrawal amount can not be negative");
        }
        else if(amount > balance)
        {
            System.out.println(Thread.currentThread().getName() + " Withdrawal amount can not be greater than Balance");
        }
        else
        {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " Amount withdrew: " + amount);
            System.out.println(Thread.currentThread().getName() + " Current Balance: " + balance);
        }
    }
    public synchronized double getBalance()
    {
        return balance;
    }
}
