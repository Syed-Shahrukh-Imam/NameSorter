package app;

/**
 * This is the app.Name class, that holds the first and the last name extracted from the file.
 */
public class Name {

    private String firstName;
    private String lastName;

    public Name( String firstName, String lastName){
        if(firstName.equals("")){
            throw new IllegalArgumentException("First name cannot be empty");
        }
        if(lastName.equals("")){
            throw new IllegalArgumentException("Last name cannot be empty");
        }

        this.firstName = firstName;
        this.lastName = lastName;
    }


    /**
     * @return The first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @return The last name
     */
    public String getLastName() {
        return lastName;
    }
}
