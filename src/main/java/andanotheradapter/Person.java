package andanotheradapter;

import java.util.Date;

public class Person {

    private String lastName;
    private String firstName;
    private String middleName;
    private Date birthDate;

    public Person(String lastName, String firstName, String middleName, Date birthDate) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
