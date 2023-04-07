
public class Esercizio2 {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }


    /**
     * 1: print out your initials using System.out.print and then a char literal,
     * i.e. 'a', 'b', 'c'. You will need multiple print statements
     */
    private static void exercise1() {
        System.out.print("M");
        System.out.println("O");
    }

    /**
     * 2: Print out your age as an int literal, i.e. 28, then print whether or not you've
     * had lunch today as a boolean literal i.e. true, false, then print the price of
     * your lunch as a double, i.e. 4.99
     */
    private static void exercise2() {
        int myYears = 28;
        System.out.print("Im years");
        System.out.println(myYears);

        boolean lunch = true;
        System.out.print("today I have eaten");
        System.out.println(lunch);

        double lunchPrice = 4.99;
        System.out.print("cost of lunch");
        System.out.println(lunchPrice);

    }

    /**
     * 3: Complete exercise 2, but store the values in a variable.
     * And then print out the variable.
     *
     * i.e.
     * char favouriteLetter = 'g';
     * System.out.print("My favourite letter=");
     * System.out.println(favouriteLetter)
     */
    private static void exercise3() {

        char favouriteLetter = 'M';
        System.out.print("My favourite letter=");
        System.out.println(favouriteLetter);

    }
}
