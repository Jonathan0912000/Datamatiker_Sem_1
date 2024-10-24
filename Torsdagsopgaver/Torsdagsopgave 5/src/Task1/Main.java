package Task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Customer> customers = new ArrayList<>();

        customers.add(new Customer("Jonathan", "Larsen", "Herskeren"));
        customers.add(new Customer("Jane", "Smith", "Slaven"));
        customers.add(new Customer("Bob", "Smith", "Bønnen"));

        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
}
