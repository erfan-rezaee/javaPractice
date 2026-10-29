import java.util.Objects;

public class BankAccountManagement {

    private final String accountNumber;
    private final String ownerName;
    private double balance;

    public BankAccountManagement(String accountNumber, String ownerName, double initialBalance){

        if (accountNumber == null || accountNumber.isBlank()){
            throw new IllegalArgumentException("Invalid accountNumber!");
        }

        if (ownerName == null || ownerName.isBlank()){
            throw new IllegalArgumentException("Invalid ownerName!");
        }

        if (!Double.isFinite(initialBalance) || initialBalance < 0){
            throw new IllegalArgumentException("Invalid Balance!");
        }

        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = initialBalance;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public String getOwnerName(){
        return ownerName;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){

        if (!Double.isFinite(amount) || amount <= 0){
            throw new IllegalArgumentException("Invalid Amount!");
        }

        double newBalance = balance + amount;

        if (!Double.isFinite(newBalance) ){
            throw new IllegalArgumentException("Invalid newBalance!");
        }
        balance = newBalance;
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


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass())
            return false;
        BankAccountManagement that = (BankAccountManagement) o;
        return accountNumber.equals(that.accountNumber);
    }
    @Override
    public int hashCode() {
        return Objects.hash(accountNumber);
    }


    public boolean transferTo(BankAccountManagement target, double amount) {

        if (target == null) {
            return false;
        }

        if (target.equals(this)) {
            return false;
        }

        if (!Double.isFinite(amount) || amount <= 0) {
            return false;
        }

        if (this.balance < amount) {
            return false;
        }
        double balanceTransfer = target.balance + amount;

        if (!Double.isFinite(balanceTransfer)){
            return false;
        }

        this.balance -= amount;
        target.balance = balanceTransfer;

        return true;
    }

    public void showInfo(){
        System.out.println("AccountNumber: " + accountNumber);
        System.out.println("OwnerName: " + ownerName);
        System.out.printf("Balance: %.1f%n" , balance);
    }

    public static void main(String[] args){

        BankAccountManagement account1 =
                new BankAccountManagement("ACC-1001", "Ali", 10_000);

        BankAccountManagement account2 =
                new BankAccountManagement("ACC-1002", "Reza", 5_000);

        account1.deposit(2_000);

        account1.withdraw(3_000);

        account1.transferTo(account2, 4_000);


        System.out.println("========== Account 1 ==========");
        System.out.println("Account Number: " + account1.accountNumber);
        System.out.println("Owner: " + account1.ownerName);
        System.out.println("Balance: " + account1.balance);
        System.out.println();
        System.out.println("========== Account 2 ==========");
        System.out.println("Account Number: " + account2.accountNumber);
        System.out.println("Owner: " + account2.ownerName);
        System.out.println("Balance: " + account2.balance);
        System.out.println("================================");

    }

}
