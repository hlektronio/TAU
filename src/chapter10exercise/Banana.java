package chapter10exercise;

public class Banana extends Fruit {

    public Banana(){
        setCallories(200);
    }
    public void peel(){
        System.out.println("Banana is peeled!");
    }

    public void cutInPieces(){
        System.out.println("Banana is cut!");
    }

    @Override
    public void makeJuice() {
        System.out.println("Banana juice is ready!");
    }
}
