package ie.atu.week10;

public class Customer extends Person {
    private int customerID;
    private boolean mailingList;

    public Customer() {
        super();
        this.customerID = 0;
        this.mailingList = false;
    }

    public Customer(String name, String address, String phoneNumber, int customerID, boolean mailingList) {
        super(name, address, phoneNumber);
        this.customerID = customerID;
        this.mailingList = mailingList;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public boolean isMailingList() {
        return mailingList;
    }

    public void setMailingList(boolean mailingList) {
        this.mailingList = mailingList;
    }

    @Override
    public String toString() {
        return super.toString() + ", Customer ID = " + customerID +
                ", Mailing List = " + mailingList;
    }
}
