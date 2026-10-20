public class OrderManager {

    String productName = "Lenovo Legion";

    double unitPrice = 85_000_000;

    int quantity = 2;

    int stock = 5;

    boolean isUserActive = true;

    boolean hasDiscountCode = true;

    String paymentMethod = "CARD";



    public boolean isValidQuantity() {

        return quantity > 0 && quantity <= stock;

    }

    public boolean canPurchase(){

        return isUserActive && isValidQuantity();
    }

    public double calculateTotalPrice() {
        return unitPrice * quantity;
    }

    public double calculateDiscount(){
        if (hasDiscountCode) {
            return calculateTotalPrice() * 10 / 100;
        }
        return 0;
    }

    public double calculateFinalPrice(){

        return calculateTotalPrice() - calculateDiscount();
    }

    public String getPaymentMethodName() {

        String methodName = switch (paymentMethod) {

            case "CARD" -> "Card Payment";
            case "CASH" -> "Cash Payment";
            case "ONLINE" -> "Online Payment";
            default -> "Invalid Payment Method";
        };
        return methodName;
    }


    public void processOrder(){

        if (!canPurchase()){
            System.out.println("Disapproved");
            return;
        }
        if (getPaymentMethodName().equals(getPaymentMethodName())){
            System.out.println("Invalid Payment Method");
            return;
        }
        System.out.println("========== Order Management ==========");
        System.out.println("Product: " + productName);
        System.out.printf("Unit Price: %.1f%n" , unitPrice);
        System.out.println("Quantity: " + quantity);
        System.out.println("Stock: " + stock);
        System.out.println("User Active: " + isUserActive);
        System.out.println("Discount Code: " + hasDiscountCode);
        System.out.printf("Total Price: %.1f%n" , calculateTotalPrice());
        System.out.printf("Discount: %.1f%n" , calculateDiscount());
        System.out.printf("Final Price: %.1f%n" , calculateFinalPrice());
        System.out.println("Payment Method: " + getPaymentMethodName());
        System.out.println("Order Status: Approved");
        System.out.println("======================================");

    }

    public static void main(String[] args){

        OrderManager order = new OrderManager();
        order.processOrder();
    }
}
