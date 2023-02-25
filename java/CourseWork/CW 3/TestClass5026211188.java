import java.util.Scanner;

public class TestClass5026211188{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        ComputeMethods5026211188 CM = new ComputeMethods5026211188();

        System.out.println("Fahrenheit to Celcius Converter!");
        System.out.print("Enter Temperature in Fahrenheit \t: ");
        double tempF = scn.nextDouble();
        double tempC = CM.fToC(tempF);
        System.out.println();

        System.out.println("Hypotenuse Calculator!");
        System.out.print("Enter Length A \t: ");
        int lengthA = scn.nextInt();
        System.out.print("Enter Lenght B \t: ");
        int lengthB = scn.nextInt();
        double hypotenuse = CM.hypotenuse(lengthA, lengthB);
        System.out.println();

        int rollDice = CM.roll();

        System.out.println("Temp in celcius is "+tempC);
        System.out.println("Hypotenuse is "+hypotenuse);
        System.out.println("The sum of the dice values is "+rollDice);
    }
}