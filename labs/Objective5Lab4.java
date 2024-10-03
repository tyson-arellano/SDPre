import java.util.Scanner;

public class Objective5Lab4 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Please enter a number: ");
            int userNum = input.nextInt();

        if(userNum % 2 == 0){
            System.out.println(userNum + " is even ");
        }
        else{
            System.out.println(userNum + " is odd");
        }
        }
    }
}
