public class NumberAnalyzer {

    public void printNumbers(){

        for (int i = 1; i <= 20; i++){
            System.out.println(i);
        }
    }

    public void printEvenNumbers(){

        for (int number = 1 ; number <= 20; number++){
            if (number % 2 == 0){
                System.out.println(number);
            }
        }
    }

    public int calculateSum(){

        int sum = 0;

        for (int i = 1; i <= 100; i++){
            sum += i;
        }
        return sum;
    }

    public int countDivisibleByThree(){

        int count = 0;
        for (int i = 1; i <= 100; i++){
            if(i % 3 == 0){
                count++;
            }
        }
        return count;
    }

    public int findFirstDivisibleBySeven(){

        int i = 1;

        while(true){
            if (i % 7 == 0){
                break;
            }
        i++;

        }
        return i;
    }

    public void printPattern(){

        for (int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void main(String[] args){
        NumberAnalyzer number = new NumberAnalyzer();
        number.printNumbers();
        System.out.println("==================");
        number.printEvenNumbers();
        System.out.println("==================");
        System.out.println(number.calculateSum());
        System.out.println("==================");
        System.out.println(number.countDivisibleByThree());
        System.out.println("==================");
        System.out.println(number.findFirstDivisibleBySeven());
        System.out.println("==================");
        number.printPattern();


    }
}
