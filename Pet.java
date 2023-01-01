// IT-145 Week 4 Project 1 by Derek Bamford

public class Pet {
	//Attributes set to private.  This was based on the (-) symbol from the UML	
	private String petType;
	private String petName;
	private int petAge;
	private int dogSpaces;
	private int catSpaces;
	private int daysStay;
	private double amountDue;

	// Constructor for declaring our instance variables
	// -1 is used to to show that no integer has been set
	public Pet() {
		petType = "noType";
		petName = "noName";
		petAge = -1;
		dogSpaces = -1;
	    catSpaces = -1;
	    daysStay =-1;
	    amountDue = 0.0;
	}
	
	// Setters (mutator, allow read access)
	// Getters (accessor, allow for write access) 
	// Both are used to access private variables. 
	// Void, when used, is to specify that a method should not return a value
	// This section is an example of encapsulation
	public void setPetType(String userPetType) {
		petType = userPetType;
	}
	public String getPetType() {
		return petType;
	}
	public void setPetName(String userPetName) {
		petName = userPetName;
	}
	public String getPetName() {
		return petName;
	}
	public void setPetAge(int userPetAge) {
		petAge = userPetAge;
	}
	public int getPetAge() {
		return petAge;
	}
	public void setDogSpaces(int userDogSpaces) {
		dogSpaces = userDogSpaces;
	}
	public int getDogSpaces() {
		return dogSpaces;
	}
	public void setCatSpaces(int userCatSpaces) {
		catSpaces = userCatSpaces;
	}
	public int getCatSpaces() {
		return catSpaces;
	}
	public void setDaysStay(int userDaysStay) {
		daysStay = userDaysStay;
	}
	public int getDaysStay() {
		return daysStay;
	}
	public void setAmountDue(double userAmountDue) {
		amountDue= userAmountDue;
	}
	public double getAmountDue() {
		return amountDue;
	}
}
