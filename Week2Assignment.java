// IT-145 Week 2 Assignment by Derek Bamford

//Defining class Dog that inherits the functions of the class Pet
//Learned from programiz.com
public class Dog extends Pet {
	
//Attributes set to private.  This was based on the (-) symbol from the UML
     private int dogSpaceNumber;
     private double dogWeight;
     private boolean grooming;   // Instant Feedback suggestion

//Constructor found in Figure 2.12.2 of Zybooks
    public Dog() {
	dogSpaceNumber = -1; //no space set
	dogWeight = -1; //no weight set
	grooming = false; //set default to false (no grooming)
    }
    
// Accessor (getter) and mutator (setter) section.  Because I am using different 
// variable names the reference (this.) to point back to the attributes is not needed, 
// only if variable names are the same

//getter with a return value
    public boolean getgrooming() {
    	return grooming;
    }
//setter is public void because method should not have a return value
    public void setgrooming(boolean usergrooming ) {
    	grooming = usergrooming ;
    }
    public double getdogWeight() {
    	return dogWeight;
    }
    public void setdogWeight(int userdogWeight) {
    	dogWeight = userdogWeight;
    }
    public int getdogSpaceNumber() {
    	return dogSpaceNumber;
    }
    public void setDogSpaceNumber(int userDogSpaceNumber) {
    	dogSpaceNumber = userDogSpaceNumber;
    }
}
