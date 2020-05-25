package chapter6exercise;

public class PhoneBill {

    int id;
    private double baseCost;
    private double allotedMin;
    private double minUsed;

    public PhoneBill() {

    }

    public PhoneBill(int id) {
        this.id = id;
    }

    public PhoneBill(int id, double baseCost, double allotedMin, double minUsed) {
        this.id = id;
        this.baseCost = baseCost;
        this.allotedMin = allotedMin;
        this.minUsed = minUsed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    public double getAllotedMin() {
        return allotedMin;
    }

    public void setAllotedMin(double allotedMin) {
        this.allotedMin = allotedMin;
    }

    public double getMinUsed() {
        return minUsed;
    }

    public void setMinUsed(double minUsed) {
        this.minUsed = minUsed;
    }

    private double calculateOverage() {
        double overageRate = .25;
        double overage = minUsed - allotedMin;

        if (overage <= 0)
            return 0;

        return overage * overageRate;
    }

    double calculateTax() {
        double subtotal = baseCost + calculateOverage();
        return subtotal * 15 / 100;
    }

    double calculateTotal() {
        return baseCost + calculateOverage() + calculateTax();
    }

    public void printBill() {
        System.out.println("Phone Bill Statement");
        System.out.println("Plan: $" + baseCost);
        System.out.println("Overage: $" + calculateOverage());
        System.out.println("Tax: $" + String.format("%.2f", calculateTax()));
        System.out.println("Total: $" + String.format("%.2f", calculateTotal()));
    }

}
