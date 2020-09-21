package project0;

import java.util.Scanner;

public class Project0 {

    /*
    Output the number of remaining number of semesters 
        ( be sure to use a whole number rounded up, you can't take .314 of a semester ), 
    and the estimated cost to complete the degree.
    */
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
       
        System.out.println("Hello hooman, Enter your name:");
        String name = keyboard.nextLine();
        
        System.out.println(name + ", enter the number of credits you have earned so far:");
        int creditsEarned = keyboard.nextInt();
        
        System.out.println(name + ", enter the total credits required for the degree:");
        int totalCreditsRequired = keyboard.nextInt();
        
        System.out.println(name + ", how many credits do you take each semester?");
        double creditsTakenPerSemester = keyboard.nextDouble();
        
        System.out.println(name + ", how much does each credit cost?");
        double costPerCredit = keyboard.nextDouble();
        
        double semestersRemaining = Math.ceil(
            ( totalCreditsRequired - creditsEarned ) / creditsTakenPerSemester );
        double costRemaining = ( totalCreditsRequired - creditsEarned ) * costPerCredit;
        
        System.out.println("Calculating...");
        System.out.println("You have " + semestersRemaining + " more semesters.");
        System.out.println("Esimated cost of $" + costRemaining + " + books and fees");
    }
    
}
