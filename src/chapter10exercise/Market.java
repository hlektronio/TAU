package chapter10exercise;

public class Market {

    public static void main(String args[]){

        Banana banana = new Banana();
        System.out.println("Banana calories: " + banana.getCallories());
        banana.peel();
        banana.cutInPieces();
        squeeze(banana);


        Fruit apple = new Apple();
        System.out.println("Apple calories: " + apple.getCallories());
        ((Apple) apple).peel();
        ((Apple) apple).cutInPieces();
        apple.makeJuice();

    }

    public static void squeeze(Fruit fruit){
        fruit.makeJuice();
    }
}
