public class Esercizio4 {
    // Don't forget to use comments to clear things up if you need them!
    public static void main (String[] args) {
        exerciseOne();
        exerciseTwo();
        exerciseThree();
        exserciseFourBonus();
        exerciseFiveBonus();
        playAroundWithModulus();
    }

    // Remember the symbols you need to do maths are =           Plus=              +
    //                                                           Minus=             -
    //                                                           Multiply or times= *
    //                                                           Divide=            /


    //1: Create an int variable, add 1 to the value and then print it. Use the +
    // then minus 1 from the same variable and print it.
    private static void exerciseOne(){
        System.out.println("Exercise1:");
        int number= 10;
        number= number+1;
        System.out.println(number);
        number= number-1;
        System.out.println(number);
    }

    //2: Create a double variable, times by 2 and then print it.
    //   Create another double variable, which is the previous variable divided by 2
    private static void exerciseTwo(){
        System.out.println("Esercizio2:");
        double number = 11.2;
        number=number*2;
        System.out.println(number);
        double number2= number/2;
        System.out.println(number2);
    }

    //3: We are going to convert the temperature from celsius to fahrenheit
    // Create a double variable called fahrenheit
    // The variable fahrenheit should be set as celsius times by 1.8 plus 32
    //Print out celsius and fahrenheit with 2 print statements
    private static void exerciseThree(){
        System.out.println("Esercizio3");
        double fahrenheit=45.9;
        double celsius=(fahrenheit-32)/1.8;
        System.out.println(fahrenheit);
        System.out.println(celsius);
    }

    //4:BONUS! This is an optional task, but it is recommended you complete it
    //Create an int called age with a starting value of 10
    //Only using the "++" operator increare this value to 15 .
    private static void exserciseFourBonus(){
        System.out.println("Esercizio4");
        int number=10;
    for (int i=0;i<5;i++){
        number++;
    }
    System.out.println(number);
    }

    //BONUS! This an optional task, but it is recommended you complete it
    //Create an int called age set as 50
    //Using the -= operator change this value from 50 to 0 in one line of code,
    //Underneath create another int called secondAge set as 50
    //Change this value from 50 to 0 in 3 lines of code
    private static void exerciseFiveBonus(){
        System.out.println("Esercizio5:");
        int age =50 ;
        age-=50;
        System.out.println(age);
        int age2=50;
        age2-=30;
        age2-=10;
        age2-=10;
        System.out.println(age2);
    }
    /**
     * This is completely optional, but if you guys want to play around with
     * modulus to get a better understanding. Simply change the code below
     */
    private static void playAroundWithModulus() {
        System.out.println("Modulus testing!:");

        int value = 15;   // <--- change this value
        int modulus = 34; // <--- and this value to see the results of modulus

        System.out.println("Modulus calculation, " + value + " % " + modulus +
                "=" + value % modulus);
    }
}
