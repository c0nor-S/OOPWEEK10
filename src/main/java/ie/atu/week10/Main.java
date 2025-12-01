package ie.atu.week10;

public class Main {
    public static void main(String[] args)
    {
        Person firstPerson = new Person();
        firstPerson.setName("John");
        firstPerson.setAddress("Galway");
        firstPerson.setPhoneNumber("081 265 3941");
        System.out.println(firstPerson.toString());

        Customer customer = new Customer();
        Customer myCustomer = new Customer("Paul", "Galway", "081 593 4380", 12, true);
        System.out.println(myCustomer.toString());



        Customer part1Customer = new Customer(
                "Alice Smith",
                "1 High Street",
                "085 123 4567",
                1001,
                true
        );

        System.out.println(part1Customer);


        Customer part2Customer = new Customer();
            part2Customer.setName("Bob Jones");
            part2Customer.setAddress("2 Lower Street");
            part2Customer.setPhoneNumber("086 765 4321");
            part2Customer.setCustomerID(1002);
            part2Customer.setMailingList(false);

            System.out.println(part2Customer);

        PreferredCustomer pc = new PreferredCustomer();
            pc.setName("Charlie Customer");
            pc.setAddress("3 Middle Road");
            pc.setPhoneNumber("087 111 2222");
            pc.setCustomerID(2001);
            pc.setMailingList(true);

            System.out.println("\nBefore Loyalty Points: ");
            System.out.println(pc);

            pc.addLoyaltyPoints(1900);
            System.out.println("\nAfter Loyalty Points: ");
            System.out.println(pc);
    }
}