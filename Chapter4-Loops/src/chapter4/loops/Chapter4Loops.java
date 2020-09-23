package chapter4.loops;

import java.util.Scanner;


public class Chapter4Loops {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        /* quick review of string input checking
        
        System.out.println("Enter your name");
        String name = keyboard.nextLine();
        
        if ( name.equalsIgnoreCase("Eric") )
        {
            System.out.println("How's your coffee?");
        }
        else
        {
            System.out.println("Do you like coffee?");
            String answer = keyboard.nextLine();
            
            if ( answer.equalsIgnoreCase("yes"))
            {
                System.out.println("Me too!");
            }
            else
            {
                System.out.println("Oh...");
            }
            
        }
        */
        
        System.out.println("How much money do you have saved right now?");
        double moneyInTheBank = keyboard.nextDouble();
        
        System.out.println("What is the interest rate ( .02 )?");
        double interestRate = keyboard.nextDouble();
        
        System.out.println("How old are you?");
        int age = keyboard.nextInt();
        
        System.out.println("How old do you want to be when you retire?");
        int retirementAge = keyboard.nextInt();
        
        System.out.println("How much money do you save every year?");
        int savingsPerYear = keyboard.nextInt();
        
        int year = 1;
        
        while ( year <= ( retirementAge - age ) ) {
            moneyInTheBank += savingsPerYear;            
            moneyInTheBank += moneyInTheBank * interestRate;
            System.out.printf("After %d year, your savings balance is: $%,.2f\n"
                , year++, moneyInTheBank);
        }
        
        int choice = 0;
        double totalPurchase = 0;
        
        // loop with a sentinel value to end
        while ( choice != 5 ){
            choice = 0;
            
            // input validation loop
            while ( choice < 1 || choice > 5 ){
                System.out.println("Welcome to our Java shop!");
                System.out.println("1. Coffee\t\t\t$1.00");
                System.out.println("2. Espresso\t\t\t$1.50");
                System.out.println("3. Latte\t\t\t\t$4.00");
                System.out.println("4. Pumpkin Spice Donut\t\t$.75");
                System.out.println("5. Checkout ");
                
                choice = keyboard.nextInt();
            }
            
            if ( choice == 1)
            {
                System.out.println("Enjoy your coffee");
                totalPurchase += 1;
            }
            else if ( choice == 2 )
            {
                System.out.println("Enjoy your espresso");
                totalPurchase += 1.5;
            }
            else if ( choice == 3 )
            {
                System.out.println("Enjoy your latte");
                totalPurchase += 4;
            }
            else if ( choice == 4 )
            {
                System.out.println("Enjoy your donut");
                totalPurchase += .75;
            }
            
        }  
        System.out.println("Thanks for stopping by the Java shop!");
        System.out.printf("Your total is: $%.2f\n", totalPurchase);
    }
}
