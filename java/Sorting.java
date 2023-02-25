import javax.swing.event.SwingPropertyChangeSupport;

/**
 * IS184203C-Genap-2019/20 - Computing Assignment 04
 * Name of Project  : Sorting Algorithm
 * Student ID       : Your NRP here
 * Student Name     : Your Full Name Here
 * Class            : Your Class here
 * Submission Date  : dd-mm-yyyy
 */

/**
 * 
 * NEVER DO 'COPY-PASTE' WHILE YOU ARE CODING
 * 
 */

public class Sorting {

    public static void main(String[] args) {
        int [] a={5,1,3,4,2,100,25,500,13};
        
        System.out.println("1. The original series of number:");
        for(int i=0; i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        
        System.out.println("2. The sorted series of number (Algorithm: Buble Sort, Order: Ascending):");
        bubleSort(a,'a');
        
        int [] b={5,1,3,4,2,100,25,500,13};
        System.out.println("3. The sorted series of number (Algorithm: Buble Sort, Order: Descending):");
        bubleSort(b,'d');
        
        int [] c={5,1,3,4,2,100,25,500,13};
        System.out.println("4. The sorted series of number (Algorithm: Selection Sort, Order: Ascending):");
        selectionSort(c,'a');
        
        int [] d={5,1,3,4,2,100,25,500,13};
        System.out.println("5. The sorted series of number (Algorithm: Selection Sort, Order: Descending):");
        selectionSort(d,'d');
        
        int [] e={5,1,3,4,2,100,25,500,13};
        System.out.println("6. The sorted series of number (Algorithm: Insertion Sort, Order: Ascending):");
        insertionSort(e,'a');
        
        int [] f={5,1,3,4,2,100,25,500,13};
        System.out.println("7. The sorted series of number (Algorithm: Insertion Sort, Order: Descending):");
        insertionSort(f,'d');
        
        
    }
    
    //buble sort algorithm
    static void bubleSort(int []arr, char order ){
       //make some modification here
       if(order == 'a'){
           for (int j=arr.length-1;j>0;j--){
           for (int x=0;x<j;x++){
               if (arr[x+1]<arr[x]){
                   int temp=arr[x];
                   arr[x]= arr[x+1];
                   arr[x+1] = temp;
               }
           }
       }
       }else
       for (int j=arr.length-1;j>0;j--){
           for (int x=0;x<j;x++){
               if (arr[x+1]>arr[x]){
                   int temp=arr[x];
                   arr[x]= arr[x+1];
                   arr[x+1] = temp;
               }
           }
       }
       //print out the array
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
    }
    
    
    //selection sort algorithm
    static void selectionSort(int []arr, char order ){
       //make some modification here
       if(order == 'a'){
        int n = arr.length;
        for(int s = 0; s<n-1; s++){
            int min_id = s;
            for(int t=s; t<n;t++){
                if(arr[t]<arr[min_id]){
                    min_id = t;
                }
            }
            //swap
            int temp = arr[s];
            arr[s] = arr[min_id];
            arr[min_id] = temp;
       }
       }else{
           int n = arr.length;
        for(int s = 0; s<n-1; s++){
            int min_id = s;
            for(int t=s; t<n;t++){
                if(arr[t]>arr[min_id]){
                    min_id = t;
                }
            }
            //swap
            int temp = arr[s];
            arr[s] = arr[min_id];
            arr[min_id] = temp;
       }
       }
       
       //print out the array
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
    }
    
    //insertion sort algorithm
    static void insertionSort(int []arr, char order ){
       //make some modification here
       int n = arr.length;
       int h, j, key;
       
       if(order == 'a'){
           for(h=1;h<n;h++){
               key = arr[h];
               j = h-1;
               
               while(j>=0 && arr[j]>key){
                   arr[j+1] = arr[j];
                   j = j-1;
               }
               arr[j+1] = key;
           }
       }else{
           for(h=1;h<n;h++){
               key = arr[h];
               j = h-1;
               
               while(j>=0 && arr[j]<key){
                   arr[j+1] = arr[j];
                   j = j-1;
               }
               arr[j+1] = key;
           }
       }
       
       //print out the array
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
    } sysou
}


/**
 * DECLARATION OF ORIGINAL WORK
 * I, hereby declare that the code is my original work. 
 * I have honored the principles of academic integrity and have upheld 
 * ITS''s  Student Code of Academic in the completion of this work.
 */
