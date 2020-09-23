package chapter4.looppractice;

import java.util.Scanner;

public class Chapter4LoopPractice {

    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        squares
        
        *****
        *****
        *****
        *****
        *****
        
        
        
        rectangles
        
        ********
        ********
        ********
        
        
        triangles
        
        *
        **
        ***
        ****
        *****
        
        
        */
        
        Scanner keyboard = new Scanner(System.in);
       String choice = "";
        while ( ! choice.equalsIgnoreCase("quit") )
        {
            System.out.println("Square");
            System.out.println("Rectangle");
            System.out.println("Triangle");
            System.out.println("Coffee");
            System.out.println("Quit");

            choice = keyboard.nextLine();
            
            if ( choice.equalsIgnoreCase("square") )
            {
                int size = 0;
                while ( size < 1 || size > 30 )
                {
                    System.out.println("What size square? ( 1 - 30 )");
                    size = keyboard.nextInt();
                }
                
                int height = 1;
                while (height <= size)
                {
                    int width = 1;
                    while ( width <= size )
                    {
                        System.out.print("*");
                        width++;
                    }
                    System.out.println("");
                    height++;
                }
                
                
            }
            else if ( choice.equalsIgnoreCase("rectangle") )
            {
                
            }
            else if ( choice.equalsIgnoreCase("triangle") )
            {
                
            }
            else if ( choice.equalsIgnoreCase("coffee") )
            {
                // http://www.ascii-art.de/ascii/c/coffee.txt
                String coffeeArt = 
"          {" + "\n" +
"        {   }" +"\n" +
"       }_{ __{" +"\n" +
"    .-{   }   }-." +"\n" +
"   (   }     {   )" +"\n" +
"   |`-.._____..-'|" +"\n" +
"   |             ;--." +"\n" +
"   |            (__  \\" +"\n" +
"   |             | )  )" +"\n" +
"   |             |/  /" +"\n" +
"   |             /  /    -Felix Lee-" +"\n" +
"   |            (  /" +"\n" +
"   \\            y'" +"\n" +
"    `-.._____..-'";
                
                System.out.println(coffeeArt);
            }
        }
    }
    
}
