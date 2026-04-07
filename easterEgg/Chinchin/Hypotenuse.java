            import java.util.Scanner;
    public class Hypotenuse {
        public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter the first length: ");
        int number1 =input.nextInt();

    System.out.print("Enter the second length: ");
        int number2 = input.nextInt();

        double length = Math.sqrt(number1 * number1 + number2 * number2);
        
        System.out.printf("Hypotenuse is %f%n : ",length);


}

}
