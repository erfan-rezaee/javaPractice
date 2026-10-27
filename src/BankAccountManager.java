public class BankAccountManager {

    private String ownerName;
    private double balance;
    private static int accountCount = 0;

    public BankAccountManager() {
        accountCount++;
    }

    public void deposit(double amount){

        if (!Double.isFinite(amount) || amount <= 0){
            throw new IllegalArgumentException("Invalid amount!");
        }
        balance += amount;

    }
    public void deposit(int amount){
        deposit((double) amount);
    }

    public boolean withdraw(double amount){

        if (!Double.isFinite(amount) || amount <= 0){
            return false;
        }
        if (amount > balance){
            return false;
        }
        balance -= amount;
        return true;
    }

    public double getBalance() {
        return balance;
    }

    public static int getAccountCount(){
        return accountCount;
    }


    public void showInfo(){
        System.out.println("OwnerName: " + ownerName);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args){

        BankAccountManager account1 = new BankAccountManager();
        BankAccountManager account2 = new BankAccountManager();

        account1.ownerName = "Ali";
        account1.balance = 2000;

        account2.ownerName = "Reza";
        account2.balance = 5000;

        account1.deposit(3000);
        account1.withdraw(1500);

        account2.deposit(2000);

        System.out.println("========== Account 1 ==========");
        account1.showInfo();
        System.out.println();
        System.out.println("========== Account 2 ==========");
        account2.showInfo();
        System.out.println();
        System.out.println("Total Accounts: " + getAccountCount());
        System.out.println("================================");


    }
}
