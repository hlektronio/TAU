package chapter4exercise;

import java.util.Random;

public class RollDieGame {

    public static void main(String args[]) {

        int squareNow = 0;
        int squaresLeft = 20;
        int totalSqaures = 20;
        int rollTimes = 5;

        //Roll die
        Random random = new Random();

        for (int i = 0; i < rollTimes; i++) {
            int die = random.nextInt(6) + 1;
            System.out.println("You rolled a " + die);

            //tell user where he is and how many squares are left
            squareNow = squareNow + die;
            squaresLeft = squaresLeft - die;


            if (squareNow<totalSqaures && i==(rollTimes-1))
                System.out.println("You lose!");

            else if(squareNow<totalSqaures && i<rollTimes) {
                System.out.println("You are now on square " + squareNow + " and there are " + squaresLeft + " left");
            }
            else if(squareNow ==totalSqaures){
                System.out.println("You win!");
                break;
            }
            else if (squareNow>totalSqaures) {
                System.out.println("You lose!");
                break;
            }

        }
    }
}
