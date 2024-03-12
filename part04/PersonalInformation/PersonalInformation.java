package PersonalInformation;

public class PersonalInformation {

    // fields
    private  String firstName;
    private String lastName;
    private String identificationNumber;

    // getters
    public String getFirstName(){
        return  this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }
    public String getIdentificationNumber(){
        return this.identificationNumber;
    }

    //constructor
    public PersonalInformation(String firstName,String lastName,String identificationNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.identificationNumber = identificationNumber;
    }

    public String toString(){
        return this.lastName + ", " + this.firstName + " (" + this.identificationNumber + ")";
    }
}
