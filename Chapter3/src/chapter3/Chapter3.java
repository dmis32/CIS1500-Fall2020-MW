package chapter3;

import java.util.Scanner;

public class Chapter3 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = keyboard.nextLine();
        
        System.out.println("What hour is it ( using 24 hour time )?");
        int hour = keyboard.nextInt();
        // this will get the enter key that was left after getting an int value
        keyboard.nextLine();
        
        if ( hour <= 15 ) {
            System.out.println("Drink more coffee!");
            System.out.println("Isn't it delicious!");
        }
        else {
            System.out.println("It's a little late for coffee, "
                + "but you should have some anyway!");
        }
        
        
        System.out.println("Please enter your score ( 0-100 ):");
        int score = Integer.parseInt( keyboard.nextLine() ); 
        
        if ( score < 63 ) {
            System.out.println("F");
        }
        
        // 63 <= score < 67
        
        // && means AND
        if ( 63 <= score && score < 67 ){
            System.out.println("D");
        }
        
        
        // a chain of if else if.... they are mutually exclusive
        // one and only one will run
        if ( score < 63 ) {
            System.out.println("F");
        }
        else if ( score < 67 ){
            System.out.println("D");
        }
        else if ( score < 70 ) {
            System.out.println("D+");
        }
        else if ( score < 73 ) {
            System.out.println("C-");
        }
        else if ( score < 77 ){
            System.out.println("C");
        }
        else if ( score < 80 ) {
            System.out.println("C+");
        }
        else if ( score < 83 ) {
            System.out.println("B-");
        }
        else if ( score < 87 ){
            System.out.println("B");
        }
        else if ( score < 90 ) {
            System.out.println("B+");
        }
        else if ( score < 94 ) {
            System.out.println("A-");
        }
        else if ( score <= 100 ) {
            System.out.println("A");
        }
        else {
            System.out.println("Invalid score!");
        }
        
        
        if ( score >= 94 ) {
            System.out.println("A");
        }
        
        System.out.println(name + ", have a great day!");
        
        char a = 'A';
        char z = 'Z';
        
        if ( a < z ){
            System.out.println("You should learn the alphabet");
        }
        else {
            System.out.println("hahah this won't run");
        }
        
        // can't compare strings with ==
        if ( name.equalsIgnoreCase( "Eric" ) ){
            System.out.println("Hello sir, are you teaching today?");
            if ( score < 90 ) {
                System.out.println("You should go over that again");
            }
            else{
                System.out.println("Full steam ahead!");
            }
        }
        else {
            System.out.println("Buckle up and grab some coffee, it's lecture time!");
        }
    }
}
