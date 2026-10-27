public class Product {

    String name;
    double price;
    int stock;
    static int productCount = 0;

    public Product(String name, double price, int stock){

        if (name == null || name.isBlank()){
            throw new IllegalArgumentException("Invalid Product name!");
        }

        if (!Double.isFinite(price) || price <= 0){
            throw new IllegalArgumentException("Invalid Price!");
        }

        if(stock < 0){
            throw new IllegalArgumentException("Invalid Stock number!");
        }

        this.name = name;
        this.price = price;
        this.stock = stock;
        productCount++;
    }

    public Product(){

        this("Unknown", 1000, 0);
    }

    public Product(String name, double price){

       this(name, price, 0);
    }

    public void showInfo(){

        System.out.println("Name: " + name);
        System.out.printf("Price: %.1f%n" , price);
        System.out.println("Stock: " + stock);
    }

    public static int getProductCount(){
        return productCount;
    }

    public static void main(String[] args){

        System.out.println("========== Product 1 ==========");
        Product product1 = new Product();
        product1.showInfo();
        System.out.println();

        System.out.println("========== Product 2 ==========");
        Product product2 = new Product("Mouse", 500_000);
        product2.showInfo();
        System.out.println();

        System.out.println("========== Product 3 ==========");
        Product product3 = new Product("Laptop", 85_000_000, 5);
        product3.showInfo();
        System.out.println();

        System.out.println("Total Products: " + getProductCount());
        System.out.println("================================");
    }

}
