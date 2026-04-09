import java.util.Scanner;
    public class Summation {

       public static void main(String[] args){

    Scanner input = new Scanner(System.in);
        System.out.println("Enter First Number");
                    int number1 = input.nextInt();
               int sum=0;
            for(int i = 1; i <= number1 ; i++) {
                  sum= sum+i;
}
  System.out.println(sum);
}


}
