package chapter5.methods;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Chapter5Methods {

    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("Welcome!");

        String name = getUsersName();
        printHello();

        for (int number = 3; number <= 10; number++) {
            System.out.println("Factoral of: " + number + " is: " + factorial(number));
            System.out.println(number);
        }

        System.out.println("The largest number is: " + getLargestNumber(1, 2, 3));

        String firstName = "Eric";
        String lastName = "Charnesky";
        System.out.println(fullName(firstName, lastName));
        System.out.println(firstName + lastName);
        
        System.out.println(getFileContents("test.txt"));
    }
    
    public static String getFileContents(String filename) throws FileNotFoundException
    {
        File file = new File(filename);
        Scanner fileReader = new Scanner(file);
        
        // this is terrible for performance, we don't care right now
        String contents = "";
        
        while ( fileReader.hasNext() )
        {
            contents += fileReader.nextLine() + "\n";
        }
        
        return contents;
        
    }

    public static String fullName(String firstName, String lastName) {
        String fullName = firstName + " " + lastName;
        firstName = "Bob";
        return fullName;
    }

    public static int getLargestNumber(int first, int second, int third) {
        int largest = first;

        if (second > largest) {
            largest = second;
        }

        if (third > largest) {
            largest = third;
        }

        return largest;
    }

    public static int factorial(int number) {
        if (number <= 1) {
            return 1;
        }

        int result = number;
        while (number > 2) {
            number--;
            result *= number;
        }

        return result;
    }

    public static String getUsersName() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your name");
        String input = keyboard.nextLine();
        return input;
    }

    public static void printHello() {
        System.out.println("Hello world!");
        System.out.println("I am the computer!");
        printHelloFromTheBorg();
    }

    public static void printHelloFromTheBorg() {
        System.out.println("Resistance is futile, perpare to be assimilated");
    }

}
