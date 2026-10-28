public class ProductBuilder {

    private String name;
    private double price;
    private int stock;

    public ProductBuilder(){

        name = "Unknown";
        price = 1000;
        stock = 0;

    }

    public ProductBuilder setName(String name){

        if (name == null || name.isBlank()){
            throw new IllegalArgumentException("Invalid Product name!");
        }
        this.name = name.trim();
        return this;
    }

    public ProductBuilder setPrice(double price){

        if (!Double.isFinite(price) || price <= 0){
            throw new IllegalArgumentException("Invalid Product Price!");
        }
        this.price = price;
        return this;
    }

    public ProductBuilder setStock(int stock){

        if (stock < 0){
            throw new IllegalArgumentException("Invalid Stock number!");
        }
        this.stock = stock;
        return this;
    }

    public void showInfo(){

        System.out.println("Name: " + name);
        System.out.printf("Price: %.1f%n" , price);
        System.out.println("Stock: " + stock);
    }

    public static void main(String[] args){

        ProductBuilder product = new ProductBuilder();


        product
                .setName("Lenovo Legion")
                .setPrice(85_000_000)
                .setStock(5);

        System.out.println("========== Product Information ==========");
        product.showInfo();
        System.out.println("=========================================");
    }
}
