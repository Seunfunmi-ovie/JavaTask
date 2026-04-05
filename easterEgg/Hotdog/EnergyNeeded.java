    import java.util.Scanner;

        public class EnergyNeeded {

         public static void main(String[] args) {

  Scanner input = new Scanner(System.in);

    System.out.println("Enter the amount of water in kg: ");
        int number1 = input.nextInt();

        System.out.println("Enter the intialTemperature: ");
        int number2 = input.nextInt();

            System.out.println ("Enter the FinalTemperature: ");
        int number3 = input.nextInt();


        int energy = number1 * (number2 * number3) * 4184;

        System.out.println("Energy needed: " + energy);


}

}
