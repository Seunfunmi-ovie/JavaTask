        import java.util.Scanner;

     public class Balance {
        public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

    System.out.println("Enter the balance: ");
        int number1 = input.nextInt();

        System.out.println("Enter the annual interest: ");
        int number2 = input.nextInt();

        double interest = (number1 * (number2 /1200));

        System.out.println("Interest is " + interest);


}

}
