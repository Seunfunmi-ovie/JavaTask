import java.util.Scanner;

    public class Cylinder {
        
     public static void main(String[] args ) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius: ");
            int number1 = input.nextInt();

        System.out.println("Enter the height: ");
            int number2 = input.nextInt();


        double volume = (3.142 * (number1 * number1))* (number2);
    double surface = (2 * 3.142 *(number1 * number1)) + (2 * 3.142 * number1 * number2);

        System.out.println("Volume is: " + volume);
        
            System.out.println("Surface area is: " + surface);


}


}
