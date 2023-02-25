import java.util.*;

public class arrayList {
    
    public static void main(String [] args) {
        ArrayList<Integer> s = new ArrayList<>();
        s.add(1);
        s.add(2);
        s.add(0,11);

        /*for(Integer n : s)
        System.out.println(n);*/

        ListIterator<Integer> litr = s.listIterator();
        while(litr.hasNext()){
            System.out.println(litr.next());
        }
        while(litr.hasPrevious()){
            System.out.println(litr.previous());
        }
    }
}
