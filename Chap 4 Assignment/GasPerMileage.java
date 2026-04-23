import java.util.Scanner;

public class GasPerMileage{
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

int miles;
int gas;
int total = 0;
int totalGallons = 0;

System.out.print("Enter miles driven (-1 to quit): ");
miles = input.nextInt();

while (miles != -1) {
System.out.print("Enter amount of gallons used: ");
gas = input.nextInt();

total += miles;
totalGallons += gas;

double milesPerGallon = (double) miles / gas;
double totalMilesPerGallon = (double) total / totalGallons;

System.out.printf("Miles per gallon for this trip: %.2f%n", milesPerGallon);
System.out.printf("Combined miles per gallon: %.2f%n%n", totalMilesPerGallon);

System.out.print("Enter miles driven (-1 to quit): ");
miles = input.nextInt();
        }
    }
}
