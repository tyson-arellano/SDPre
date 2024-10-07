import java.util.Scanner;

public class Objective7Lab5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int selection; 
       
  
      while (true) {
        
        System.out.println("_____Menu_____");
        System.out.println("1: Say Hello");
        System.out.println("2: List My favorite foods");
        System.out.println("3: Exit");
        System.out.println();
        
        selection = scanner.nextInt();

        switch (selection){
            case 1 -> System.out.println("Hello Human");
            case 2 -> System.out.println("Apples, Bananas, Coconuts");
            case 3 -> System.out.println("Goodbye");
                
            
            default -> System.out.println("Invalid Selection, Please select 1, 2 or 3. ");
        }
        if (selection ==3) {
            break;
        }
  
      }
  
      scanner.close();
    }
  }