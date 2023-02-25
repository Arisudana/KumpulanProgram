import java.util.Scanner;
import java.lang.Math.*;

public class Searching {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to search!");
        int key = sc.nextInt();
        
        int [] a = {8,9,10,11,5,3};
        int r = jumpSearch(key, a);
        if(r==-1) System.out.println("Number not found");
        else System.out.println("Number found");
    }
    
    public static int linearSearch(int key, int a[]){
        for (int i = 0;i<a.length;i++){
            if(a[i]==key) return i;
        } 
        return -1;
    }

    public static int binarySearch(int key, int a[]){
        insertionSort(a);
        int l = 0;
        int u = a.length-1;

        do{
            int m = (l+u)/2;
            if(a[m]==key) return m;
            else if(key > a[m]){
                l = m+1;
            }else{
                u = m-1;
            }
        }while(u != l);

        return -1;
    }

    public static int jumpSearch(int key, int a[]) {
        insertionSort(a);
        for(int i=0; i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        int js = (int) Math.sqrt(a.length);
        System.out.println(js);
        int i = 0;

       do{
            // if key = content
            if(key == a[i]) return i;
            // if key > content
            else if(key > a[i]){
                // if index out of bound
                if(i + js > a.length){
                    // linear search forward
                    for(int j = i; j< a.length;j++){
                        if(a[j] == key) return j;
                    }
                    return -1;
                // jump    
                }else i += js;
            // if key < content
            }else{
                // linear search backward
                for(int j = i; j >= i - js;j--){
                    if(a[j] == key) return j;
                }
                return -1;
            }
        }while(i<a.length);
        return -1;
    }

    static void insertionSort(int []arr){
        //make some modification here
        int n = arr.length;
        int h, j, key;
        
         for(h=1;h<n;h++){
                key = arr[h];
                j = h-1;
                
                while(j>=0 && arr[j]>key){
                    arr[j+1] = arr[j];
                    j = j-1;
                }
                arr[j+1] = key;
            }
         
     }
    
}