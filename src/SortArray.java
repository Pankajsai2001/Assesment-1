import java.util.*;

public class SortArray {
    public static void main(String [] args){

        Integer [] input = new Integer[] {1,2,3,8,11,12};
        sortMyArray(input);
    }
    public static void sortMyArray(Integer [] input) {
        ArrayList<Integer> l = new ArrayList<Integer>(List.of(input));
        Collections.sort(l);
        ArrayList<Integer> left = new ArrayList<Integer>();
        ArrayList<Integer> right = new ArrayList<Integer>();
        int flag=0,lsum=0,rsum=0;
        int i=0,j=l.size()-1;

        left.add(l.get(j));
        lsum+=l.get(j);
        j--;
        right.add(l.get(j));
        rsum+=l.get(j);
        j--;
        for ( ; j>=0;j--){
            if (lsum < rsum){
                left.add(l.get(j));
                lsum+=l.get(j);
            }
            else{
                right.add(l.get(j));
                rsum+=l.get(j);
            }
        }
        if(left.size()>=right.size()){
            left.addAll(right);
            l.clear();
            l.addAll(left);
        }
        else{
            right.addAll(left);
            l.clear();
            l.addAll(right);
        }
        System.out.print(l);

    }
}
