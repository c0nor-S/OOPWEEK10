package ie.atu.week10;

public class PreferredCustomer extends Customer {
    private int loyaltyPoints;
    private double discountLevel;

    public PreferredCustomer() {
        super();
        this.loyaltyPoints = 0;
        this.discountLevel = 0;
    }

    public PreferredCustomer(String name, String address, String phoneNumber, int customerID, boolean mailingList, int loyaltyPoints) {
        super(name, address, phoneNumber, customerID, mailingList);
        this.loyaltyPoints = loyaltyPoints;
        updateDiscountLevel();
    }

    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public void setLoyaltyPoints(int loyaltyPoints) {
        this.loyaltyPoints = loyaltyPoints;
        updateDiscountLevel();
    }

    public double getDiscountLevel() {
        return discountLevel;
    }

    public void setDiscountLevel(double discountLevel) {
        this.discountLevel = discountLevel;
    }

    private void updateDiscountLevel() {
        if(loyaltyPoints >=0 && loyaltyPoints< 500) {
            this.discountLevel = 0.00;
        }
        else if(loyaltyPoints >= 500 && loyaltyPoints < 1000) {
            this.discountLevel = 0.05;
        }
        else if(loyaltyPoints >= 1000 && loyaltyPoints < 1500) {
            this.discountLevel = 0.06;
        }
        else if(loyaltyPoints >= 1500 && loyaltyPoints < 2000) {
            this.discountLevel = 0.07;
        }
        else{
            this.discountLevel = 0.10;
        }
    }

    public void addLoyaltyPoints(int points) {
        loyaltyPoints += points;
        updateDiscountLevel();
    }


    @Override
    public String toString() {
        return super.toString() + ", loyaltyPoints = "+ loyaltyPoints +
                ", discountLevel = " + discountLevel;
    }
}
