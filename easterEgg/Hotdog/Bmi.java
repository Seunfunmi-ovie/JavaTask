    import java.util.Scanner;
 public class Bmi {

        public static void main (String[] args ) {
       Scanner input = new Scanner(System.in);

        System.out.println("Enter weight in pounds: ");
            int number1 = input.nextInt();

             System.out.println("Enter height in inches : ");
            int number2 = input.nextInt();       

        double display = (number1 * 0.45359237) / (number2 * 0.0254);

    System.out.println("Display BMI : " + display);


}

}
