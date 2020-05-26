package chapter10exercise;

public class Apple extends Fruit {

    public Apple(){
        setCallories(100);
    }

    public void removeSeeds(){
        System.out.println("Seeds are removed!");
    }

    public void peel(){
        System.out.println("Apple is peeled");
    }

    public void cutInPieces(){
        System.out.println("Apple is cut!");
    }

    @Override
    public void makeJuice() {
        System.out.println("Apple juice is ready!");
    }
}
