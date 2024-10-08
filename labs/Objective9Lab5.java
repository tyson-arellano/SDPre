import java.util.Scanner;

public class Objective9Lab5 {

  public static void main(String[] args) {
    Scanner kb = new Scanner (System.in);
		double num1;
        double num2;
		boolean keepGoing = true;
		int choice;
		
        System.out.println("Please choose a number");
        num1 = kb.nextDouble();
        System.out.println("Please choose another number");
        num2 = kb.nextDouble();
        double average = findAverage(num1, num2);
        double tax = calcTax(num1, num2);

		while (keepGoing) {
			printMenu();
			System.out.print("Which would you like to do? ");
			choice = kb.nextInt();

			switch (choice) {
                case 1 -> System.out.println(num1 + " + " + num2 + " = " + findSum(num1, num2));
                case 2 -> System.out.println("The average of " + num1 + " & " + num2 + " is: " + average);
                case 3 -> System.out.println("The amount of tax to be collected on " + num1 + " and " + num2 + " is: " + tax );
                case 4 -> System.out.println("You've chosen to quit");

                default -> System.out.println("Invalid Entry. Please try again");
			}
            if (choice == 4){
                break;
            }
		}
		kb.close();

	}

	public static void printMenu() {
		System.out.println();
		System.out.println("========= MENU =========");
		System.out.println("|                      |");
		System.out.println("|   1. Add Numbers     |");
		System.out.println("|   2. Find Average    |");
		System.out.println("|   3. Calculate Tax   |");
		System.out.println("|   4. Exit            |");
		System.out.println("|                      |");
		System.out.println("========================");
		System.out.println();
	}

	public static double findSum(double x, double y) {
		double sum = x + y;
		return sum;
	}
    
    public static double findAverage( double x, double y) {
        double av = ( x + y ) / 2;
        return av;
    }

    public static double calcTax( double x, double y){
        double calc = ( x + y ) * 0.0831;
        return calc;
    }
}