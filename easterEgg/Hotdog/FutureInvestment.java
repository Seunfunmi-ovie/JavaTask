    import java.util.Scanner;
  public class FutureInvestment {

       public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("InvestmentAmount: ");
        int number1 = input.nextInt();

        System.out.println("MonthlyInterest: ");
            int number2 = input.nextInt();
                System.out.println("Number of year: ");
                        int number3 = input.nextInt();
        
  double future = number1 * Math.pow(1 +number2, number3 * 12);

        System.out.println("FutureInvestmentRate is: ");


}


}
