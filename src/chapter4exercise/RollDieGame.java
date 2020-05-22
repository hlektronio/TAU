package chapter4exercise;

import java.util.Random;

public class RollDieGame {

    public static void main(String args[]) {

        int squareNow = 0;
        int totalSquares = 20;
        int squaresLeft = 20;

        //Roll die
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            int die = random.nextInt(6) + 1;
            System.out.println("You rolled a " + die);

            //tell user where he is and how many squares are left
            squareNow = squareNow + die;
            squaresLeft = squaresLeft - die;

            if(squareNow<20) {
                System.out.println("You are now on square " + squareNow + " and there are " + squaresLeft + " left");
            }
            else if(squareNow ==20){
                System.out.println("You win!");
                break;
            }
            else if (squareNow>20) {
                System.out.println("You lose!");
                break;
            }
        }
    }
}
