package thijava;

public class Student {
    private String EnrollID;
    private String FirstName;
    private String LastName;

    public Student() {
    }

    public Student(String enrollID, String firstName, String lastName) {
        EnrollID = enrollID;
        FirstName = firstName;
        LastName = lastName;
    }

    public String getEnrollID() {
        return EnrollID;
    }

    public void setEnrollID(String enrollID) {
        EnrollID = enrollID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }
}
