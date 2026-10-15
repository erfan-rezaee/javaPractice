public class BankAccount {

    String ownerName;
    double balance;
    static  String bankName = "Meli Bank";

    public BankAccount(String ownerName, double balance) {

        this.ownerName = ownerName;
        this.balance = balance;
    }

    public void deposit(double amount) {

        if (amount > 0) {

            double newBalance = balance + amount;
            balance = newBalance;
            System.out.println("Deposit successful");

        } else {

            System.out.println("Invalid deposit amount!");
        }
    }

    void showInfo(){

        System.out.println("========== Bank Account ==========");
        System.out.println("Bank: " + bankName);
        System.out.println("Owner: " + ownerName);
        System.out.println("Balance: " + balance);
        System.out.println("==================================");
    }
    public static void main(String[] args){

        BankAccount account = new BankAccount("Erfan", 1000);
        account.deposit(-2000);
        account.showInfo();
    }
}

