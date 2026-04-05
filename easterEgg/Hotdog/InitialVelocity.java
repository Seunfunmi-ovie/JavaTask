    import java.util.Scanner;

    public class InitialVelocity {
        public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
    System.out.println("Enter the initial velocity: ");
        int number1 = input.nextInt();

     System.out.println("Enter the time span: ");
        int number2 = input.nextInt();



        
        System.out.println("Enter the acceleration: ");
            int number3 = input.nextInt();

        
   double distance = (number1 * number2) + (0.5 * number3 * (number2 * number2));

        System.out.println("Distance is: " + distance);


}

}
