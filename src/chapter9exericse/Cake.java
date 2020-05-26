package chapter9exericse;

public class Cake {

    public String flavor;
    double price;


    public Cake(String flavor){
        this.flavor = flavor;
        setPrice(9.99);
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
