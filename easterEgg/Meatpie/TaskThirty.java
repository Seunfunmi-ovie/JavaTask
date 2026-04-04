import java.util.Scanner;

public class TaskThirty {

    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

        System.out.print("Enter first figure: ");
        int number1 = input.nextInt();

        System.out.print("Enter second figure: ");
        int number2 = input.nextInt();

        int sum = number1 + number2;
            int product = number1 * number2;


        System.out.printf("Sum is %d%n", sum);

        
        System.out.printf("Product is %d%n", product);


}


}

