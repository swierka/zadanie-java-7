public class SchoolPeople {
    private String firstName;
    private String lastName;

    public SchoolPeople(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public SchoolPeople() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void show() {
        System.out.println(firstName + " " + lastName);
    }
}
