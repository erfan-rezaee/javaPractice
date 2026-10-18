public class ShoppingCalculator {

    String productName = "Lenovo Legion";
    double unitPrice =85_000_000;
    int quantity = 3;
    double discountPercentage = 15;
    double taxPercentage = 10;
    int maxAllowed = 5;

    double totalPrice =  unitPrice * quantity;

    public double calculateDiscount() {

        return totalPrice * discountPercentage / 100;
    }

    double afterDiscount = totalPrice - calculateDiscount();

    public double calculateTax(){

        return afterDiscount * taxPercentage / 100;

    }

    double finalPrice = afterDiscount + calculateTax();
    double amountByPerson = finalPrice / 4;
    double eachPersonPays = Math.ceil(amountByPerson);
    int acceptedQuantity = Math.min(maxAllowed, quantity);



    public static void main(String[] args) {
        ShoppingCalculator calculator = new ShoppingCalculator();

        System.out.println("========== Shopping Calculator ==========");
        System.out.println("Product: " + calculator.productName);
        System.out.printf("Unit Price: %.1f%n" , calculator.unitPrice);
        System.out.println("Quantity: " + calculator.quantity);
        System.out.printf("Total Price: %.1f%n" , calculator.totalPrice);
        System.out.printf("Discount: %.1f%n" , calculator.calculateDiscount());
        System.out.printf("After Discount: %.1f%n" , calculator.afterDiscount);
        System.out.printf("Tax: %.1f%n" , calculator.calculateTax());
        System.out.printf("Final Price: %.1f%n" , calculator.finalPrice);
        System.out.printf("Each Person Pays: %.1f%n" , calculator.eachPersonPays);
        System.out.println("Allowed Quantity: " + calculator.acceptedQuantity);
        System.out.println("=========================================");
        
    }
}
