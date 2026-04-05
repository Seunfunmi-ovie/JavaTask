 import java.util.Scanner;
        public class Airplane {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

    System.out.println("Enter the velocity: ");
        int number1 = input.nextInt();

        System.out.println("Enter the area: ");
            int number2 = input.nextInt();

        double length = (number1 * number1) / (2 * number2);
  System.out.println("Length is: " + length);


}

}
