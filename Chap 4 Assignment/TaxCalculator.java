import java.util.Scanner;

public class TaxCalculator {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

int citizen = 1;
while (citizen <= 3){
citizen++;

System.out.println("What is your name: ");
String name = input.next();

System.out.println("Enter the yearly earnings for each citizen: ");
double earnings = input.nextDouble();

double totalTax;

if (earnings <= 30000) {
totalTax = earnings * 0.15;
}
else{
totalTax = earnings * 0.20;
 }

System.out.printf("%s total tax: %.2f%n%n", name, totalTax);
}
}
}
