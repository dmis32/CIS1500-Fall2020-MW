package project1;

import java.util.Scanner;

public class Project1 {

    /*
    Create a 'text based adventure game' styled after the famous https://en.wikipedia.org/wiki/Zork

Create several action and navigation options for a player to choose from, and a 'help' option that displays all the available choices ( except the secret escape word ).

One of the actions should 'wound' the player and if a player is too wounded, they are required to sleep before they can continue.  The only acceptable option for a 'wounded' player is to sleep.  After they sleep, they are no longer wounded.

Each command will always give the same response to the player regardless of where they are.

Add at least 4 'action' commands, at least 4 'navigation' commands like Go North, an option to sleep, an option for help, and a secret escape word that ends the game.
    
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Welcome to our crappy text based adventure game!");

        String input = "";
        boolean isWounded = false;

        while (!input.equalsIgnoreCase("quit")) {

            System.out.println("What do you want to do?");

            input = keyboard.nextLine();

            if (input.equalsIgnoreCase("north") && !isWounded) {
                System.out.println("You go north");
            } else if (input.equalsIgnoreCase("east") && !isWounded) {
                System.out.println("You go east");
            } else if (input.equalsIgnoreCase("south") && !isWounded) {
                System.out.println("You go south");
            } else if (input.equalsIgnoreCase("west") && !isWounded) {
                System.out.println("You go west");
            } else if (input.equalsIgnoreCase("run") && !isWounded) {
                System.out.println("You run away");
            } else if (input.equalsIgnoreCase("hide") && !isWounded) {
                System.out.println("You hide");
            } else if (input.equalsIgnoreCase("fight") && !isWounded) {
                System.out.println("You fight the monster, and get "
                        + "wounded in the process, you should sleep!");
                isWounded = true;
            } else if (input.equalsIgnoreCase("sleep")) {
                System.out.println("You sleep, and feel all better!");
                isWounded = false;
            } else if (input.equalsIgnoreCase("help")) {
                System.out.println("You can: north, east, south, west, run, hide, fight, sleep");
            } else if (input.equalsIgnoreCase("quit")) {
                // do nothing, let the loop finish
            } else if (isWounded) {
                System.out.println("You are wounded and must sleep!");
            } else {
                System.out.println("You can't do that!");
            }
        }

        System.out.println("Thanks for playing our game!");

    }

}
