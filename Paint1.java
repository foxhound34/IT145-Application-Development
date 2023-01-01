//Import java utilities Scanner and InputMisMatch
import java.util.Scanner;
import java.util.InputMismatchException;


public class Paint1 {
	//Declare the attributes
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double wallHeight = 0;
        double wallWidth = 0;
        double wallArea = 0.0;
        double gallonsPaintNeeded = 0.0;
        //Constant Variable
        final double squareFeetPerGallons = 350.0;
    //(do/while loop) with a try/catch statement inside to catch invalid inputs
    do {
    	try {
        System.out.println("Enter wall height (feet): ");
        wallHeight = scnr.nextDouble();
        if(wallHeight <= 0.0) {
			System.out.println("Invalid Height\n");
        }
    	}
    	catch(InputMismatchException e){// Catches Exceptions and prints invalid input
            System.out.println("Invalid Input\n");
            	scnr.next();//clears invalid input to receive new input when going back through the loop
        }
    }
        while(wallHeight <= 0.0);
    //(do/while loop) with a try/catch statement inside to catch invalid inputs		
     do {  
    	 try {
        System.out.println("Enter wall width (feet): ");
        wallWidth = scnr.nextDouble();
        if(wallWidth <= 0.0) {
			System.out.println("Invalid Width\n");
        }
    	}
    	 catch(InputMismatchException e){// Catches Exceptions and prints invalid input
             System.out.println("Invalid Input\n");
             	scnr.next();//clears invalid input to receive new input when going back through the loop
        } 
     }   
        while(wallWidth <= 0.0);
        
        // Calculate and output wall area
        wallArea = wallHeight * wallWidth;
        System.out.println("Wall area: "+ wallArea + " square feet");

        // Calculate and output the amount of paint (in gallons) needed to paint the wall
        gallonsPaintNeeded = wallArea/squareFeetPerGallons;
        System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons");
    } 
}
