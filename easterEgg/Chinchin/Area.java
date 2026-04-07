    import java.util.Scanner;
        public class Area {
        public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

     System.out.println("Enter the base: ");
        int number1 = input.nextInt();

    System.out.println("Enter the height: ");
        int number2 = input.nextInt();

        double area = (number2 * number1)/2;

        System.out.println("Area is " + area);

}

}
