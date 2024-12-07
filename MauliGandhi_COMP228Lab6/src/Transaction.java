public class Transaction implements Runnable{

    private final Account account;
    private final String transactionType;
    private final double amount;

    public Transaction(Account account, String transactionType, double amount)
    {
        this.account = account;
        this.transactionType = transactionType;
        this.amount = amount;
    }

    @Override
    public void run() {
        switch (transactionType.toLowerCase())
        {
            case "deposit":
                account.deposit(amount);
                break;
            case "withdraw":
                account.withdraw(amount);
                break;
            default:
                System.out.println(Thread.currentThread().getName() + " Invalid transaction type. Please try again");
        }

        System.out.println(Thread.currentThread().getName() + " Current Balance: " + account.getBalance());
    }
}
