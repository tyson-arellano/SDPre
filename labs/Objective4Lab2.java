import java.util.Scanner;

public class Objective4Lab2 {
    public static void main(String[] args) {

        try (Scanner keyboard = new Scanner(System.in)){
        System.out.println("Please enter the first whole number you would like to add.");
        int num1 = keyboard.nextInt();
        System.out.println("Please enter the second whole number you would like to add.");
        int num2 = keyboard.nextInt();
        System.out.println("Please enter the third whole number you would like to add."); 
        int num3 = keyboard.nextInt();
        int wholeSum = num1 + num2 + num3;
        System.out.println("Please enter the first decimal number you would like to add.");
        double dub1 = keyboard.nextDouble(); 
        System.out.println("Please enter the first decimal number you would like to add.");
        double dub2 = keyboard.nextDouble(); 
        System.out.println("Please enter the first decimal number you would like to add.");
        double dub3 = keyboard.nextDouble();
        double dubSum = dub1 + dub2 + dub3;

        System.out.println("The sum of " + num1 + " + " + num2 + " + " + num3 + " = " + wholeSum );
        System.out.println("The sum of " + dub1 + " + " + dub2 + " + " + dub3 + " = " + dubSum );
      }
    }
}
