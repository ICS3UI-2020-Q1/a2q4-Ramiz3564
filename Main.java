 import java.util.Scanner;

/**
 *This program 
 * @author Zach
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //creates a scanner for user input
    Scanner input = new Scanner(System.in);
    //prompt user for amount spent
    System.out.println("Please enter the amount the customer spent"); 
    //initailizing the money spent
    double moneySpent = input.nextDouble();

    //determine the money spent
    if (moneySpent <= 40.00){ 
      //tell them how much they will save 
      System.out.println("they will receive 10% off");
      double discount1 = moneySpent * 0.1; 
      //tell them how much they saved
      System.out.println("they will save $" + discount1 + "."); 
      double total1 = moneySpent - discount1; 
      //tell them their total 
      System.out.println("The new total is $" + total1 + ".");  
    } else if(moneySpent <= 80.00 && moneySpent >= 40.01){
      System.out.println("They will receive 20% off");
      double discount2 = moneySpent * 0.2;
      System.out.println ("they will save $" + discount2 + ".");
      double total2 = moneySpent - discount2;
      System.out.println ("the new total is $" + total2 + ".");
    }else if(moneySpent <= 120.00 && moneySpent >= 80.01){
      System.out.println("they will receive 30% off"); 
      double discount3 = moneySpent * 0.3;
      System.out.println("they will save $" + discount3 + ".");
      double total3 = moneySpent - discount3;
      System.out.println("The new total is $" + total3 + ".");
    }else if(moneySpent >= 120.01){
      System.out.println ("they will receive 40% off. ");
      double discount4 = moneySpent *0.4;
      System.out.println("they will save $" + discount4 + ".");
      double total4 = moneySpent - discount4;
      System.out.println("The new total is $" + total4 + ".");
    }
    
  }
}
