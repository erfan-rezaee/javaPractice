public class Car {

    String brand;
    String model;
    int speed;

    public void accelerate(){
        speed += 10;
    }

    public void brake(){

        if(speed >= 10){
            speed -= 10;
        } else {
            speed = 0;
        }
    }

    public void showInfo(){
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Speed: " + speed);
    }

    public static void main(String[] args){

        Car car1 = new Car();
        car1.brand = "BMW";
        car1.model = "530i";
        car1.speed = 100;

        Car car2 = new Car();
        car2.brand = "Benz";
        car2.model = "C200";
        car2.speed = 50;

        car1.accelerate();
        car1.accelerate();
        car2.brake();
        System.out.println("========== Car 1 ==========");
        car1.showInfo();
        System.out.println();
        System.out.println("========== Car 2 ==========");
        car2.showInfo();
    }
}
