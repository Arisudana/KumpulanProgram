import java.util.Scanner;

public class Sensus{
    public static void main(String[] args){
        System.out.println("PROGRAM PENCETAK DATA SENSUS\n");

        Scanner input = new Scanner(System.in);

        System.out.print("Nama Kepala Keluarga \t: ");
        String Name = input.nextLine();
        //System.out.println();
        System.out.print("Alamat Rumah \t: ");
        String Address = input.nextLine();

        System.out.print("Panjang tubuh \t: ");
        int Long = Integer.parseInt(input.nextLine());

        System.out.print("Lebar Tubuh \t: ");
        int Wide = Integer.parseInt(input.nextLine());

        System.out.print("Tinggi Tubuh \t: ");
        int Height = Integer.parseInt(input.nextLine());

        System.out.print("Berat Tubuh \t: ");
        int Weight = Integer.parseInt(input.nextLine());

        System.out.print("Jumlah Anggota keluarga \t: ");
        int Member = Integer.parseInt(input.nextLine());

        System.out.print("Tanggal Lahir \t: ");
        String Age = input.nextLine();

        System.out.print("Catatan Tambahan \t: ");
        String Add = input.nextLine();

        System.out.print("Jumlah Cetakan \t: ");
        int Copy = Integer.parseInt(input.nextLine());
        
        System.out.println("\n");

        /*
        System.out.println(String.format("--------------------------\nProgram Pencetak Data Sensus\nName\t: %s\nAddress\t: %s\nLong\t: %d\nWide\t: %d\nHeight\t: %d\nWeight\t: %d\nMember\t: %d\nAge\t: %s\nAdd\t: %s\nCopy\t: %d"
        ,Name,Address,Long,Wide,Height,Weight,Member,Age,Add,Copy));
        */

        System.out.println("Percetakan 1 dari 3 untuk: Arsip pemerintah provinsi Tamfir");
        System.out.println("DATA SIAP DICETAK UNTUK ARSIP PEMERINTAH PROVINSI TAMFIR\n");
        System.out.println("--------------------\n");
        System.out.println(Name + " - " + Address);
        System.out.println("Lahir pada tanggal " + Age);
        System.out.println("Rasio Berat Per Volume\t:");
        System.out.println("Catatan: " + Add);

    }   
}