    import java.util.Scanner;

    public class Point {
        public static void main(String[] args ) {

    Scanner input = new Scanner(System.in);

        System.out.println("Enter x1: ");
            int number1 = input.nextInt();

        System.out.println("Enter the x2: ");
            int number2 = input.nextInt();

        System.out.println("Enter the y1: ");
            int number3 = input.nextInt();

        System.out.println("Enter the y2: ");
            int number4 = input.nextInt();

        double distance = Math.sqrt(number2-number1) * (number2-number1) + (number4-number3) * (number4-number3);

        System.out.println("Distance is: " + distance);


}

}
