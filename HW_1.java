
public class HW_1 {
    public static void main(String[] args) {                                        // zadanie NO 1

        createVariable();
        System.out.println(mathExpression(10,20, 30, 40));
        System.out.println(chackRange10_20(20, 10));
        showPosetiveNegative(20);
        System.out.println(showTrueNegativeNum(5));
        helloName("Michael");
        ifLeapYear(1997);
        ifLeapYear(1998);
        ifLeapYear(1999);
        ifLeapYear(2000);
        ifLeapYear(2001);
    }

    public static void createVariable(){
        byte a = 50;                                                                // zadanie NO 2
        short b = 1500;
        int c = 123456;
        long d = 123456789;
        float e = 22.54f;
        double f = 55.24;
        boolean g = true;
        char h = 'H';
    }

    public static double mathExpression (double a, double b, double c, double d) {    // zadanie NO 3
        double e = a * (b + (c / d));

        return e;
    }

    public static boolean chackRange10_20 (int a, int b) {                             // zadanie NO 4
        int c = a + b;

        if (c >= 10 && c <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void showPosetiveNegative (int a) {                               // zadanie NO 5
        if (a >= 0) {
            System.out.println("Posative number!!!");
        }
        else {
            System.out.println("Nagative number!!!");
        }
    }

    public static boolean showTrueNegativeNum (int a) {                                 // zadanie NO 6
        if (a < 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void helloName(String name){                                      // zadanie NO 7
        System.out.println("Privet, " + name + "!");
    }


    public static void ifLeapYear (int year){                                       // zadanie NO 8

        int range = year;

        if (range % 4 == 0){
            if (range % 100 != 0 || range % 400 == 0){
                System.out.println(range + " This is a leap year!!!");
            }
            else {
                System.out.println(range + " This is NOT a leap year!!!");
            }
        }
        else {
            System.out.println(range + " This is NOT a leap year!!!");
        }
    }
}
