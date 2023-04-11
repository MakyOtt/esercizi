public class Esercizio7 {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
    }

    /**
     * 1: Using the 'Integer' and the String class, convert ourNumber below to an int
     * Once this is converted to an int, increase its value by 2
     * Then convert this back to a string and print it, it should be 90 and not 882
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        String ourNumberStr = "88";
        int ourNumberInt= Integer.valueOf(ourNumberStr);
        ourNumberInt += 2;
        System.out.println(String.valueOf(ourNumberInt));

    }

    /**
     * 2a: Convert ourChar to a String, make it uppercase
     * <p>
     * 2b: Play around line 37, experiment the integer of 0 to a number where it prints 'w', instead of 'H'
     * think about what the charAt method is doing?
     */
    private static void exercise2() {
        System.out.println("Exercise 2a:");
        char ourChar = 'a';
        String ourCharString = String.valueOf(ourChar).toUpperCase(); // <--- Change this line
        // .charAt ( numero posizione che vogliamo prendere in considerazione  )
        System.out.println(ourCharString.charAt(0));

        System.out.println("Exercise 2b:");
        String anotherString = "Hello world";
        int charAtIndex = 6; // <--- Change this line
        System.out.println("Make this print 'w' -> current result: '" + anotherString.charAt(charAtIndex) + "'");
    }


    /**
     * 3: This exercise currently throws 'exceptions' (big red error messages in our console)
     * <p>
     * Change the 3 lines indicated below so it no longer crashes, think about the type
     * conversions. "hello" can't be a number
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");

        String intStrToConvert = "55"; // Change this line
        System.out.println(Integer.valueOf(intStrToConvert));

        String booleanStrToConvert = "true"; // And this line
        System.out.println(Boolean.valueOf(booleanStrToConvert));

        String doubleStrToConvert = "2.3"; // Also this line
        System.out.println(Double.valueOf(doubleStrToConvert));
    }


    /**
     * 4: Given our string 'startStr'
     *    4.1: use a string method to make sure it can convert to an int and convert it to an int
     *    4.2: Times our number by 2
     *    4.3: Convert back to a string, and concatenate our number with itself,
     *         (i.e. 4 concatenated with itself is 44, not 8)
     *    4.4: Convert to a double and divide our number by 3.5
     *    4.5: Use Math.floor to remove decimal places on our number
     *
     *    Your result should be 288.0!
     */
    private static void exercise4() {
        System.out.println("Exercise 4:");
        String startStr = "5 ";
        int startInt= Integer.valueOf(startStr.trim());
        System.out.println(startInt);
        startInt *=2;
        System.out.println(startInt);
        String startStr2= String.valueOf(startInt);
        startStr2+=startStr2;
        System.out.println(startStr2);
        double startDouble= Double.valueOf(startStr2);
        System.out.println(startDouble);
        startDouble /= 3.5;
        System.out.println(startDouble);
        startDouble= Math.floor(startDouble);
        System.out.println(startDouble);
    }
}