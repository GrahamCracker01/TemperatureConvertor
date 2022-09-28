import java.util.Scanner;
class Main {
    public static void main(String[] args){

        //declare scanner and variables
        Scanner scan = new Scanner(System.in);
        double dblStartingTemp;
        double dblFahrenheit;

        //get input
        System.out.print("Enter a starting temperature in Kelvin: ");
        dblStartingTemp = scan.nextDouble();

        //math
        dblFahrenheit = (dblStartingTemp - 273.15) * 1.8 + 32;

        //output
        System.out.println(dblStartingTemp + " degrees Kelvin is " + String.format("%.1f", dblFahrenheit) + " degrees in Fahrenheit.");

        //second output message depending on final temperature
        if (dblFahrenheit >= 80) {
            System.out.println("It's hot today!");
        }
        else if (dblFahrenheit <= 45) {
            System.out.println("It's cold today. Grab a jacket!");
        }
        else {
            System.out.println("Nice weather today!");
        }

    }
}