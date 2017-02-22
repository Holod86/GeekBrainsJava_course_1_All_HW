/**
 * Created by Michael Holodovsky Home work for lession 3 on 22.02.2017.
 */
import java.util.*;

public class GuessTheNum {
    public static void main (String[] args) {

        game();
    }

    static void game () {

        int trys = 1;
        int rendomNum = (int) (Math.random() * 10);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Guess number from 0 until 9: ");
        while (trys <= 4) {
            if (trys == 4){
                System.out.println("Game Over!!!");
                break;
            }
            int a = scanner.nextInt();

            if (a < 0 || a > 9) {
                System.out.println("Your number is out of range!!!");
            }
            else if (a == rendomNum){
                System.out.println("Congratulations!!! You guess the number!!!");
                break;
            }
            else if (a > rendomNum) {
                System.out.println("Your number is higher then the need number!!!");
                trys += 1;
            }
            else if (a < rendomNum){
                System.out.println("Your number is lower then the need number!!!");
                trys += 1;
            }
        }

        System.out.println("If you want play again press 1, if not press 0: ");

        while (true){
            int a = scanner.nextInt();

            if (a == 1) {
                System.out.println("Good to see you back!!!");
                game();
            }
            else if (a == 0) {
                System.out.println("Bay Bay!!!");
                break;
            }
            else {
                System.out.println("Incorrect select!!! Please select 1 or 0!!!");
            }
        }
    }
}

















