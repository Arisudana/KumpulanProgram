import java.util.Random;

public class ComputeMethods5026211188{
    public double fToC(Double degreesF){
        return 5.0/9.0*(degreesF-32);
    }
    public double hypotenuse(int a, int b){
        return Math.sqrt((a*a)+(b*b));
    }
    public int roll(){
    Random randomRoll = new Random();
    int dice1 = randomRoll.nextInt(6)+1;
    int dice2 = randomRoll.nextInt(6)+1;
    return dice1+dice2;
    }
}