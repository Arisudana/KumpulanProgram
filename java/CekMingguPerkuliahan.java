import java.util.Scanner;

public class CekMingguPerkuliahan{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Minggu apakah ini \t: ");
        String minggu = input.next();

        if(minggu.equals("genap") || minggu.equals("Genap")){
            System.out.println("UPMB");
            System.out.println("1. Fisika (26)");
            System.out.println("2. Kewarganegaraan (18)");
            System.out.println("3. Matematika (26)");
            System.out.println("4. B. Inggris (46)");
            System.out.println();
            System.out.println("Departemen");
            System.out.println("1. Statistika (18)");
        }else if(minggu.equals("ganjil") || minggu.equals("Ganjil")){
            System.out.println("UPMB");
            System.out.println("1. Agama Hindu (166)");
            System.out.println();
            System.out.println("Departemen");
            System.out.println("1. Algoritma & Pemrograman (15)");
            System.out.println("2. Organisasi Fungsional Bisnis (15)");
        }else{
            System.out.println("Baru tau ada yang selain ganjil genap");
        }
    }
}

