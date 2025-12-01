package ie.atu.week10;

public class Main {
    public static void main(String[] args)
    {
        Person firstPerson = new Person();
        firstPerson.setName("John");
        firstPerson.setAddress("Galway");
        firstPerson.setPhoneNumber("081265394");
        System.out.println(firstPerson.toString());

        Customer customer = new Customer();
        Customer myCustomer = new Customer("Paul", "Galway", "08159343", 12, true);
        System.out.println(myCustomer.toString());

        PreferredCustomer preferredCustomer = new PreferredCustomer();
        PreferredCustomer myPreferredCustomer = new PreferredCustomer("Conor", "Knocknacarra", "0851834364", 141, true, 1300);
        System.out.println(myPreferredCustomer.toString());
    }
}