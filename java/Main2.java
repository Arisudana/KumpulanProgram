/**
 * Main class of the Java program.
 */
import java.util.Scanner;
public class Main2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your test number");
        int k = sc.nextInt();
        
        int [] a = {8,9,10,11,5,3};
        int r = linearSearch(k, a);
        if(r==-1) System.out.println("sorry, you have not past the exam");
        else System.out.println("congratulation!, you passed the exam");
    }
    
    public static int linearSearch(int k, int a[]){
        for (int i = 0;i<a.length;i++){
            if(a[i]==k) return i;
        } 
        return -1;

}
}