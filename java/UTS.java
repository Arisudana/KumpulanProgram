public class UTS{
    public static void main(String[] args) {
      int sum=0; 
      int[] nilai ={87,100,98,45,79};
      for(int i=0;i<nilai.length;i+=2){
          sum += nilai[i];
      }
      System.out.print(sum);
    }
}