import java.util.Scanner;

public class Objective5Lab3 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)){
        System.out.println("Please enter a number: ");
        int userNum = scanner.nextInt();
        if(userNum==0){
            System.out.println(userNum + " is equal to 0 ");
        }
        else if( userNum > 0){
            System.out.println(userNum + " is greater than 0 ");
        }
        else{
            System.out.println(userNum + " is less than 0 ");
        }
        }
    }
}
