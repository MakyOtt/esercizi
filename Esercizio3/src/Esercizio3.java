public class Esercizio3 {
    public static void main(String[] args){
        exerciseOne();
        exerciseTwo();
        exerciseThree();
    }
    //1: store your age in an appropriate variable, print it out in one line using the "+"
    //in your print statement
    private static void exerciseOne(){
        int myAge=28;
        System.out.println("I have " + myAge );
    }
    //2: store your first name initial (i.e. Jane -> J) in a variable, your age in another variable.
    // and then print them out on the same line using the following idea
    // System.out.println("my age=" + myAge +", my initial=" +myInitial);
    private static void exerciseTwo(){
     char marika='M';
        int myAge=28;
        System.out.println("my age=" + myAge +", my initial=" +marika);
    }
    //3: write comments above each live of code, describing what the line of code is doing
    private static void exerciseThree(){
        //assegno due variabili una per stabilire se ho mangiato o meno , l'altra per specificare il costo del pranzo
        boolean hasEatenlunch = false;
        double lunchCost= 5.99;
        //stampo i volo valori
        System.out.println("Lunch cost= "+lunchCost);
        System.out.println("Has Eaten lunch" + hasEatenlunch);

    }


}
