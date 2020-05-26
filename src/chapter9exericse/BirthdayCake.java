package chapter9exericse;

public class BirthdayCake extends Cake {

    int candles;

    public BirthdayCake(){
        super("vanilla");
        setPrice(15);

    }

    public int getCandles() {
        return candles;
    }

    public void setCandles(int candles) {
        this.candles = candles;
    }
//    public void setFlavor(String flavor) {
//        this.flavor = flavor;
//    }
//
//    public String getFlavor() {
//        return flavor;
//    }

}
