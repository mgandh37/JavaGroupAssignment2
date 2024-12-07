import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AccountOperation {
    public static void main(String[] args)
    {
        //pseudo code
        /*
        Account account = new Account(5000); // Initial balance


        System.out.println("Account Balance: " + account.getBalance());
        // Create a list of transactions
        List<Transaction> transactions = new ArrayList<>();
        transactions.add(new Transaction(account, "deposit", 2000));
        transactions.add(new Transaction(account, "withdraw", 1000));
        transactions.add(new Transaction(account, "withdraw", 500));
        transactions.add(new Transaction(account, "deposit", 3000));
        transactions.add(new Transaction(account, "withdraw", 8000)); // final balance 500

        // Use ExecutorService to execute threads
        try (ExecutorService executor = Executors.newFixedThreadPool(3)) {

            for (Transaction transaction : transactions) {
                executor.execute(transaction);
            }

            // Shut down the executor
            executor.shutdown();
            while (!executor.isTerminated()) {
                // Wait for all tasks to complete
            }
        }

        System.out.println("Final Balance: " + account.getBalance());
        //Final balance should be 500
        */
    }
}
