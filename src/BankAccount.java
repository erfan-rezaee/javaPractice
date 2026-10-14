public class BankAccount {

    String ownerName;
    double balance;
    static  String bankName = "Meli Bank";

    public BankAccount(String ownerName, double balance) {

        this.ownerName = ownerName;
        this.balance = balance;
    }

    public double deposit(double plus){
        return (balance += plus);
    }

    void showInfo(){

        System.out.println("========== Bank Account ==========");
        System.out.println("Bank: " + bankName);
        System.out.println("Owner: " + ownerName);
        System.out.println("Balance: " + balance);
        System.out.println("==================================");
    }
    public static void main(String[] args){

        BankAccount account = new BankAccount("Erfan", 2000);
        account.deposit(3000);
        account.showInfo();
    }
}

