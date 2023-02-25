import java.util.Scanner;

public class CobaCoba{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int numb;
        System.out.println("Enter the number of elements you want to store: ");

        numb = sc.nextInt();

        int[] array = new int[numb];

        System.out.println("Enter the elements of the array: ");
        for

        System.out.println("Sort by (a/d) :");
        String sortStyle = sc.nextLine();

        System.out.println("sorting");
        int [] arr = {10,20,50,30,40};
        insertionSort(arr);
    }

    public static void selectionSort(int[] a){
        int n = a.length;
        for(int s = 0; s<n-1; s++){
            int min_id = s;
            for(int t=s; t<n;t++){
                if(a[t]<a[min_id]){
                    min_id = t;
                }
            }
            //swap
            int temp = a[s];
            a[s] = a[min_id];
            a[min_id] = temp;
        }
        for(int v:a){
            System.out.print(v+" ");
        }
    }

    public static void bubleSort(int[] a) {
        int n = a.length;
        int i,j;
        for(i=0;i<n-1;i++){
            for(j=0;j<n-i-1;j++){
                if(a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
                }
            }
            for(int v:a){
                System.out.print(v+" ");
        }
    }

    public static void insertionSort(int[] a) {
        int n = a.length;
        int i,j;
        int key;
        for(i=1;i<n;i++){
            key = a[i];
            j = i-1;

            while(j>=0 && a[j]>key){
                a[j+1] = a[j];
                j=j-1;
            }
            a[j+1]=key;
        }
        for(int v:a){
            System.out.print(v+" ");
    }
    }
}