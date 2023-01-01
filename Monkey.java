// The monkey class (a derived class) inherits attributes from the base class RescueAnimal
public class Monkey extends RescueAnimal {
	
	// New Instance variable for Monkey class set to private to prevent users from changing 
	private String tailLength;
	private String height;
	private String bodyLength;
	private String species;


    // Constructor for both inherited and new attributes
    public Monkey(String species, String name, String gender, String age,
    	    String height, String weight, String tailLength,String bodyLength,
    	    String acquisitionDate, String acquisitionCountry,
    		String trainingStatus, boolean reserved, String inServiceCountry) {
    	
    	
    	setName(name);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);
        setTailLength(tailLength);
        setHeight(height);
        setBodyLength(bodyLength);
        setSpecies(species);
        
      //initializing new attributes
    	tailLength = "none";
    	height = "none"; 
    	bodyLength = "none";
    	species = "none";
        
     } 
    
    // Setters (mutator, allow read access)
 	// Getters (accessor, allow for write access) 
 	// Both are used to access private variables. 
 	// Void, when used, is to specify that a method should not return a value
 	// This section is an example of encapsulation
    public String getTailLength() {
        return tailLength;
    }

    public void setTailLength(String newTailLength) {
        tailLength = newTailLength;
    }
    
    public String getHeight() {
        return height;
    }

    public void setHeight(String newHeight) {
        height = newHeight;
    }
    public String getBodyLength() {
        return bodyLength;
    }

    public void setBodyLength(String newBodyLength) {
        bodyLength = newBodyLength;
    }
    public String getSpecies() {
        return species;
    }

    public void setSpecies(String newSpecies) {
        species = newSpecies;
    }
    public String getInServiceCountry() {
        return inServiceCountry;
    }
    }
    
//}
