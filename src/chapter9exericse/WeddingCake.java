package chapter9exericse;

public class WeddingCake extends Cake{

    int tiers;

    public WeddingCake(){
        super("oreo");
        setTiers(4);
        setPrice(30);
    }
//    public void setFlavor(String flavor) {
//        this.flavor = flavor;
//    }
//
//    public String getFlavor() {
//        return flavor;
//    }

    public int getTiers() {
        return tiers;
    }

    public void setTiers(int tiers) {
        this.tiers = tiers;
    }
}
