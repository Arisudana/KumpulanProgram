import java.util.Scanner; 

public class Basic{
    public static void main(String[] args){
        System.out.println("Masukan Identitas ");

        Scanner input = new Scanner(System.in);

        System.out.print("Nama anda \t: ");
        String Nama = input.nextLine();

        System.out.println("\n");

        System.out.println("Halo " + Nama + " :)");
        
    }
}
    