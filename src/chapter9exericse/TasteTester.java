package chapter9exericse;

public class TasteTester {

    public static void main(String args[]) {

        Cake cake = new Cake("chocolate");
        System.out.println("Plain Cake");
        System.out.println("-----------");
        System.out.println("Cake flavor: " + cake.getFlavor());
        System.out.println("Price: $" + cake.price);
        System.out.println();

        BirthdayCake birthdayCake = new BirthdayCake();
        birthdayCake.setCandles(40);
        System.out.println("Birthday Cake");
        System.out.println("-----------");
        System.out.println("Cake flavor: " + birthdayCake.getFlavor());
        System.out.println("Price: $" + birthdayCake.getPrice());
        System.out.println("Number of candles: " + birthdayCake.candles);
        System.out.println();

        WeddingCake weddingCake = new WeddingCake();
        weddingCake.setTiers(2);
        weddingCake.setFlavor("cherry");
        System.out.println("Wedding Cake");
        System.out.println("-----------");
        System.out.println("Cake flavor: " + weddingCake.getFlavor());
        System.out.println("Tiers: " + weddingCake.tiers);
        System.out.println("Price: $" + weddingCake.getPrice());
    }

}
