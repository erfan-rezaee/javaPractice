public class SalaryCalculator{
    public  static  void main(String[] args){

        String employeeName = "Ali";
        int baseSalary = 25_000_000;
        double bonusPercentage = 12.5;
        String allowance = "5000000";

        //Widening Conversion
        double bonus = baseSalary * bonusPercentage / 100;
        double salary = baseSalary + bonus;

        //Narrowing Casting
        long castSalary= (long) salary;

        //Number to String
        String strBaseSalary = String.valueOf(baseSalary);

        //Parsing
        int numberOfAllowance = Integer.parseInt(allowance);
        double finalSalary = salary + numberOfAllowance;

        System.out.println("========== Employee Salary ==========");
        System.out.println("Employee: " + employeeName);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Bonus Percentage: " + bonusPercentage + "%");
        System.out.println("Bonus Amount: " + bonus);
        System.out.printf("Salary Before Allowance: %.0f%n", salary);
        System.out.println("Salary as Long: " + castSalary);
        System.out.println("Allowance: " + numberOfAllowance);
        System.out.printf("Final Salary: %.0f%n", finalSalary);
        System.out.println("=====================================");
    }
}