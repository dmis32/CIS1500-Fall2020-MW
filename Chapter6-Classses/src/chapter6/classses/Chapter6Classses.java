package chapter6.classses;

import java.util.Random;
import java.util.Scanner;

public class Chapter6Classses {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random random = new Random();

        Tree oakTree = new Tree("Oak");
        oakTree.setGrowthInCentimetersPerYear(10);

        for (int year = 0; year < 10; year++) {
            System.out.println("Type of tree: " + oakTree.getType());
            System.out.println("Age of tree: " + oakTree.getAge());
            System.out.println("Height of tree: " + oakTree.getHeight());
            oakTree.grow();
        }
       
        System.out.println(oakTree);

        Tree mapleTree = new Tree("Maple");
        mapleTree.grow(50);
        
        
        Tree elmTree = new Tree("Elm", 40, 63);
        System.out.println(elmTree);
        
        System.out.println("The type of tree has " + mapleTree.getType().length() + " chars");

        Cup snorlaxMug = new Cup();
        snorlaxMug.setColor("Teal with picture of Snorlax");
        snorlaxMug.setMaxCapacityInMililiters(591);
        snorlaxMug.pour(600);

        while (snorlaxMug.getCurrentVolumeInMililiters() != 0) {
            printCup(snorlaxMug);
            snorlaxMug.drink(random.nextInt(20));
        }

        printCup(snorlaxMug);
        
        Rectangle rectangle = new Rectangle(2, 3);
        

    }

    public static void printCup(Cup cup) {
        System.out.println("Color: " + cup.getColor());
        System.out.println("Current Volume: " + cup.getCurrentVolumeInMililiters());
    }

}
