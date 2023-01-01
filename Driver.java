//Imports utilities for an Array and Scanner which allows for user input
import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
	// Declares a new array for dog and monkey and monkey species list
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();
    private static ArrayList<String> speciesList = new ArrayList<String>(6);
    
    public static void main(String[] args) {
    	//Makes a list of all eligible monkey species
     		speciesList.add("Capuchin");
     		speciesList.add("Guenon");
     		speciesList.add("Macaque");
     		speciesList.add("Marmoset");
     		speciesList.add("Squirrel monkey");
     		speciesList.add("Tamarin");
    	
    	
    	//Initialize Variables and lists
    	initializeDogList();
        initializeMonkeyList();
    	String choice;
    	boolean repeat = true;
    	//Sets scnr variable to receive input from a keyboard
    	Scanner scnr = new Scanner(System.in); 
    	
    //The Switch() statement was recommended by the feedback tool
    //Information can be found in Zybooks Lesson 3.1 Switch Statements
    	
    while (repeat) { // while repeat is true the loop will continue 
        displayMenu();//Displays the menu to the user
    	choice = scnr.nextLine();//accepts user input and stores it in variable choice
    	
    	switch(choice) {//passes the user input stored in the variable choice to the switch statement
    	
    	case "1":
            intakeNewDog(scnr);//calls the method intakeNewDog
            break; // prevents fall-through to the next case

         case "2":
            intakeNewMonkey(scnr);
            break;

         case "3":
            reserveAnimal(scnr);
            break;

         case "4":
            printAnimals("dog");//calls the printAnimals switch method dog below
            break;

         case "5":
            printAnimals("monkey");
            break;

         case "6":
            printAnimals("available");
            break;

         case "q":
        	 System.out.println("Program ended. Goodbye");//Ends program
        	 repeat = false;//Changes boolean value of choice to false breaking out of loop
        	 break;

         default:
            System.out.println("Invalid input, try again.");//bad input catch statement
            break;
    	}
    	}
}
    // This method prints the menu options
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }

    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }

    // Adds monkeys to a list for testing
    public static void initializeMonkeyList() {
    	//Stores the data typed in the () to a new monkey object.  
    	//The data must follow  the sequence order found in the monkey class
    	Monkey monkey1 = new Monkey("Macaque", "Clyde", "male", "8", "22", "16", "18", "24", "01-19-2015", "United States", "intake", false, "Canada" );
    	Monkey monkey2 = new Monkey("Capuchin", "Abu", "male", "4", "24", "12", "14", "24", "05-12-2019", "Morocco", "in service", false, "Canada");
        Monkey monkey3 = new Monkey("Tamarin", "Marcel", "female", "3", "12", "6", "7", "12", "02-24-2016", "United States", "Phase I", false, "United States");

        //adds the attributes from monkey object to monkey array
        monkeyList.add(monkey1);
        monkeyList.add(monkey2);
        monkeyList.add(monkey3);

    }

    // The input validation to check that the dog is not already in the list
    	public static void intakeNewDog(Scanner scanner) {
    		System.out.println("What is the dog's name?");
    		String name = scanner.nextLine();
    		for(Dog dog: dogList) { //advanced for loop that iterates over dog list to check if name is present
    			if(dog.getName().equalsIgnoreCase(name)) {//Ignores case type of user input
    				System.out.println("\n\nThis dog is already in our system\n\n");
    				return; //returns to menu
            }
        }//Sets the attributes for a new dog
    		System.out.println("What is the dog's breed?");
            String breed = scanner.nextLine();//Obtains user data and stores in variable
            
            System.out.println("What is the dog's gender?");
            String gender = scanner.nextLine();

            System.out.println("What is the dog's age?");
            String age = scanner.nextLine();
            
            System.out.println("What is the dog's weight? (lbs)");
            String weight = scanner.nextLine();
            
            System.out.println("What is the dog's acquisition date? (mm-dd-yy)");
            String acquisitionDate = scanner.nextLine();
            
            System.out.println("What is the dog's acquisition country?");
            String acquisitionCountry = scanner.nextLine();
            
            System.out.println("What is the dog's training status?");
            String trainingStatus = scanner.nextLine();
            
            System.out.println("Is the dog reserved? Y/N");
            boolean reserved = scanner.nextLine().equalsIgnoreCase("Y");
            
            System.out.println("What country will the dog be servicing?");
            String inServiceCountry = scanner.nextLine();
            
            //New dog object with attributes and variable names 
            Dog newDog = new Dog(name, breed, gender, age, weight, acquisitionDate, acquisitionCountry, trainingStatus, reserved, inServiceCountry);

            dogList.add(newDog);//adds all attribute data to dog list.
    } 
    	
        public static void intakeNewMonkey(Scanner scanner) {
        	System.out.println("What species is the monkey?");
            String species = scanner.nextLine();
            
			//checks if species is allowed by checking species list set above
            boolean ans = speciesList.contains(species);
            if(! ans) {
                System.out.println("Species is not allowed");
                return;
            }
            //This section sets each additional user input a new variable that had been defined in monkey.java
            System.out.println("What is the monkey's name?");
            String name = scanner.nextLine();
          //Checks to see in monkey is already in the system.
            for(Monkey monkey: monkeyList) { 
    			if(monkey.getName().equalsIgnoreCase(name)) {
    				System.out.println("\n\nThis monkey is already in our system\n\n");
    				return; //returns to menu
    			}
            }
            System.out.println("What is the monkey's gender?");
            String gender = scanner.nextLine();

            System.out.println("What is the monkey's age?");
            String age = scanner.nextLine();
            
            System.out.println("What is the monkey's height? (inches)");
            String height = scanner.nextLine();
            
            System.out.println("What is the monkey's weight? (lbs)");
            String weight = scanner.nextLine();
            
            System.out.println("What is the monkey's tail length? (inches)");
            String tailLength = scanner.nextLine();
            
            System.out.println("What is the monkey's body length? (inches)");
            String bodyLength = scanner.nextLine();
            
            System.out.println("What is the monkey's acquisition date? (mm-dd-yy)");
            String acquisitionDate = scanner.nextLine();
            
            System.out.println("What is the monkey's acquisition country?");
            String acquisitionCountry = scanner.nextLine();
            
            System.out.println("What is the monkey's training status? (intake,in service,Phase I");
            String trainingStatus = scanner.nextLine();
            
            System.out.println("Is the monkey reserved? Y/N");
            boolean reserved = scanner.nextLine().equalsIgnoreCase("Y");

            System.out.println("What country will the monkey be servicing?");
            String inServiceCountry = scanner.nextLine();
            
            Monkey newMonkey = new Monkey(species, name, gender, age, height, weight, tailLength, bodyLength, acquisitionDate, acquisitionCountry, trainingStatus, reserved, inServiceCountry);

            monkeyList.add(newMonkey);
        }

        //Finds the animal by animal type and in service country
        public static void reserveAnimal(Scanner scanner) {
        		for(Dog dog: dogList) {
        			if(dog.getReserved()== false && dog.getTrainingStatus() != "in service") {
        				System.out.println("Name      Status     Service Country     Reserved    ");
        				System.out.printf("%-10s", dog.getName());
        				System.out.printf("%-11s", dog.getTrainingStatus());
        				System.out.printf("%-20s", dog.getInServiceCountry());
        				System.out.printf("%s%n", dog.getReserved());
        				System.out.println();
        				System.out.println("Would you like to reserve this animal?(Y/N)");
        				String saveAnimal = scanner.nextLine();
    				if(saveAnimal.equalsIgnoreCase("y")) {
    					dog.setReserved(true);
    					System.out.println(dog.getName() + " has been reserved");
    					return;//returns to menu
    				}
    				else if(saveAnimal.equalsIgnoreCase("n")) {
    					return;
    				}
        			}
    			}
        
        	for(Monkey monkey: monkeyList) {
        		if(monkey.getReserved()== false && monkey.getTrainingStatus() != "in service") {
        			System.out.println("Name      Status     Service Country     Reserved    ");
    				System.out.printf("%-10s", monkey.getName());
    				System.out.printf("%-11s", monkey.getTrainingStatus());
    				System.out.printf("%-20s", monkey.getInServiceCountry());
    				System.out.printf("%s%n", monkey.getReserved());
    				System.out.println();
    				System.out.println("Would you like to reserve this animal?(Y/N)");
    				String saveAnimal = scanner.nextLine();
    			if(saveAnimal.equalsIgnoreCase("y")) {
    				monkey.setReserved(true);
    				System.out.println(monkey.getName() + " has been reserved");
    				return;//returns to menu
    				}	
    			else {
    				}
    			}
    			}
    	}
        public static void printAnimals(String animalPrint) {
        	//Switch case allows us to separate the multiple print animal statements
        	switch(animalPrint) {
        	
        	// dog - prints the list of dogs
        	case"dog":
        		System.out.println("Name      Status         Acq. Country        Reserved    ");
        		for(Dog dog: dogList) {//iterates through the array using dog as the temp variable
        			System.out.printf("%-10s", dog.getName());//gets the information stored in the array
        			System.out.printf("%-15s", dog.getTrainingStatus());
    				System.out.printf("%-20s", dog.getAcquisitionLocation());
    				System.out.printf("%s%n", dog.getReserved());
        	}
        	break;
        	// monkey - prints the list of monkeys
        	case "monkey":
        		System.out.println("Name      Status         Acq. Country        Reserved    ");
            	for(Monkey monkey: monkeyList) {//iterates through the array using monkey as the temp variable 
            		System.out.printf("%-10s", monkey.getName());//gets the information stored in the array
        			System.out.printf("%-15s", monkey.getTrainingStatus());
    				System.out.printf("%-20s", monkey.getAcquisitionLocation());
    				System.out.printf("%s%n", monkey.getReserved());
            	 }
            	break;
            	
            // This code prints out a list of all available animals if they are not reserved, but
            // have completed training and are in service.
        	case "available":
        		System.out.println("Name      Status         Acq. Country      Reserved    ");
        		for(Dog dog: dogList) {
        			if(dog.getReserved()== false && dog.getTrainingStatus() == "in service") {
        				System.out.printf("%-10s", dog.getName());
        				System.out.printf("%-15s", dog.getTrainingStatus());
        				System.out.printf("%-18s", dog.getAcquisitionLocation());
        				System.out.printf("%s%n", dog.getReserved());
        			}
        		}
    			for(Monkey monkey: monkeyList) {
    				if(monkey.getReserved()== false && monkey.getTrainingStatus() == "in service") {
    					System.out.printf("%-10s", monkey.getName());
    					System.out.printf("%-15s", monkey.getTrainingStatus());
    					System.out.printf("%-18s", monkey.getAcquisitionLocation());
    					System.out.printf("%s%n", monkey.getReserved());
    				}
            	 }
        	}
        }	        
}

