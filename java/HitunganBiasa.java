import java.util.Scanner;

class HitunganBiasa{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your height:");
        String height = input.nextLine();
        double a = Double.parseDouble(input);
        a = a-100;
        System.out.print("Your ideal weight is "+a);
    }
}

    