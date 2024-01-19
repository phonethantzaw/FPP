package Assignment3a.Prog1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Customer c1 = new Customer();
        c1.setFirstName("Mike");
        c1.setLastName("Json");
        c1.setSocSecurityNum("123A");

        Address b1 = new Address("3rd St", "Chicago", "IL", "1234");
        Address s1 = new Address("2nd St", "Fairfield", "IA", "1233");

        c1.setBillingAddress(b1);
        c1.setShippingAddress(s1);

        Customer c2 = new Customer();
        c2.setFirstName("Christ");
        c2.setLastName("Brown");
        c2.setSocSecurityNum("123B");

        Address b2 = new Address("5th St", "Springfield", "IL", "12345");
        Address s2 = new Address("4th St", "San Diago", "LA", "1232");

        c2.setBillingAddress(b2);
        c2.setShippingAddress(s2);

        Customer c3 = new Customer();
        c3.setFirstName("Sophia");
        c3.setLastName("Lilly");
        c3.setSocSecurityNum("123B");

        Address b3 = new Address("Mahantan St", "New York", "NY", "12345");
        Address s3 = new Address("9th St", "Queen", "NY", "1232");

        c3.setBillingAddress(b3);
        c3.setShippingAddress(s3);

        List<Customer> custList = new ArrayList<>();
        custList.add(c1);
        custList.add(c2);
        custList.add(c3);

        for (Customer c : custList) {
            if (c.getBillingAddress().getCity().equals("Chicago")) {
                System.out.println(c);
            }

        }


    }


}
