package Task1;

public class Customer {
    private String firstName;
    private String lastName;
    private String userName;
    private int id;
    static int counter;

    public Customer(String firstName, String lastName, String userName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.id = counter++;
    }

    public String getFirstName() {
        return firstName;

    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    @Override
    public String toString(){
        return "fulde navne: "+ firstName + " " + lastName + "\n" + "Brugernavn: " + userName +"\n";
    }
}
