import static java.lang.Math.incrementExact;
import static java.lang.Math.random;

/**
 * Created by Michael Holodovsky on 18.02.2017.
 * Home work lession 2
 */

public class HW_2 {
    public static void main(String[] args){

        // ******************************* Exercise NO 1 ******************************************
        int switch_0_1[] = new int[10];

        for (int i = 0; i < switch_0_1.length; i++) {
            switch_0_1[i] = (int) (Math.random() * 2);
            System.out.print(" " + switch_0_1[i]);
        }
        System.out.println(" ");
        for (int i = 0; i < switch_0_1.length; i++){
            if (switch_0_1[i] == 1){
                switch_0_1[i] = 0;
                System.out.print(" " + switch_0_1[i]);
            }
            else {
                switch_0_1[i] = 1;
                System.out.print(" " + switch_0_1[i]);
            }
        }
        System.out.println(" ");
        System.out.println(" ");

        // ******************************* Exercise NO 2 ******************************************
        int arrUpLedderOf3[] = new int[8];
        int x = -3;

        for (int i = 0; i < arrUpLedderOf3.length; i++){
            arrUpLedderOf3[i] = x + 3;
            x = arrUpLedderOf3[i];
            System.out.print(" " + arrUpLedderOf3[i]);
        }
        System.out.println(" ");
        System.out.println(" ");

        // ******************************* Exercise NO 3 ******************************************
        int under_6_multipliedBy_2[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < under_6_multipliedBy_2.length; i++){
            if (under_6_multipliedBy_2[i] < 6){
                under_6_multipliedBy_2[i] *= 2;
            }
            System.out.print(" " + under_6_multipliedBy_2[i]);
        }
        System.out.println(" ");
        System.out.println(" ");

        // ******************************* Exercise NO 4 ******************************************
        int size1 = 10;
        int size2 = 10;

        int xMatrix[][] = new int[size1][size2];

        for (int i = 0; i < xMatrix.length; i++) {
            for (int j = 0; j < xMatrix.length; j++) {
            xMatrix[i][j] = i * j;
                if (i == j || i + j == 9){
                    xMatrix[i][j] = 1;
                    System.out.print(xMatrix[i][j]);
                }
                else {
                    xMatrix[i][j] = 0;
                    System.out.print(xMatrix[i][j]);
                }
            }
            System.out.println(" ");
        }
        System.out.println(" ");

        // ******************************* Exercise NO 5 ******************************************
        int arrMinMax[] = {1, 2, 3, 4, 5, 6, 7};

        int max = arrMinMax[0];
        int min = arrMinMax[0];

        for (int i = 0; i < arrMinMax.length; i++){
            if (arrMinMax[i] > max){
                max = arrMinMax[i];
            }
        }
        System.out.println("The max number in this arrey is " + max);

        for (int i = 0; i < arrMinMax.length; i++){
            if (arrMinMax[i] < min){
                min = arrMinMax[i];
            }
        }
        System.out.println("The min number in this arrey is " + min);




    }
}