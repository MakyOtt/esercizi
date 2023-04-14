public class Esercizio5 {
    public static void main(String[] args) {
        exerciseOne();
        exerciseTwo();
        exerciseThree();
        exerciseFourBonus();
    }

    //1:Create a double variable called value, create another double variable called valueSquareRoot
    //Use Math.sqrt to find the square root of value and assign it to valueSquareRoot
    private static void exerciseOne(){
        System.out.println("Esercizio1");
       double value=6;
       double valueSquareRoot= Math.sqrt(value);
       System.out.println(valueSquareRoot);
    }
    //2:See the code below
    //Print out the highest value using Math.max()
    //Then print out the lowest value using Math.min()
    //You must put your variables into these methods and separate them with a comma
    private static void exerciseTwo(){
        System.out.println("Esercizio2:");
        int valueA=5;
        int valueB=10;

        System.out.println("Max= "+ Math.max(valueA,valueB));
        System.out.println("Min= "+ Math.min(valueA,valueB));
    }

    //3:Use Modulus (%) to calculate the remaining amount of money if we buy as many burgers as possible,
    //print remainder
    private static void exerciseThree(){
        System.out.println("Esercizio3:");
        int totalMoney=50;
        int costPerBurger=9;

        System.out.println("Remaindner= "+ totalMoney % costPerBurger);
    }

    //4:BONUS! This is an optional task, but it is recommended you complete it
    //I've chosen loads of methods from the Match Library, write comments above each line to guess what they do!
    //You do not need to write any cose
    //Answers can be found in resources
    private static void exerciseFourBonus(){
        System.out.println("Esercizio4:");
        double ourValue= 4.5;

        //Math.ceil -> arrotonda il numero per eccesso all'intero più vicino
        System.out.println(ourValue+ "after using ceiling=" + Math.ceil(ourValue));
        //Math.floor -> arrotonda il numero per difetto all'intero più vicino
        System.out.println(ourValue+ "after using floor=" + Math.floor(ourValue));
        //Math.round -> arrotonda il numero all'intero più vicino
        System.out.println(ourValue+ "after using round=" + Math.round(ourValue));
        //Math.pow ( variabile, of potenza  ) -> eleva alla potenza dichiarata in questo caso of 2
        System.out.println(ourValue+ "after using powerOf with the value of2=" + Math.pow(ourValue,2));
        //Math.pow ( variabile, of potenza  ) -> eleva alla potenza dichiarata in questo caso of 3
        System.out.println(ourValue+ "after using powerOf with the value of3=" + Math.pow(ourValue,3));
        //Math.random()* -> moltiplica per un valore casuale
        System.out.println(ourValue+ "times random=" + Math.random()*ourValue);


    }
}
