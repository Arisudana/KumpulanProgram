import java.util.Scanner;

public class ProcessAName5026211188{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter your name \t: ");
        String fullName = scn.nextLine();
        int specindx = fullName.indexOf(" ");
        char firstName = fullName.charAt(0);
        String lastName = fullName.substring(specindx+1);

        System.out.println();
        System.out.println("Your name is: "+lastName+", "+firstName+".");
    }
}