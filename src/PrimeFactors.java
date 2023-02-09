import java.util.ArrayList;

public class PrimeFactors {
    static ArrayList<Integer> l1 = new ArrayList<Integer>();
    public static void main(String args[]){

        computePrimeFactors(11);
        System.out.print(l1);
    }

    public static void computePrimeFactors(int x){

        int i;
        for ( i=x-1; i>=1; i--) {
            if (isPrime(i)) {
                l1.add(i);

                break;
            }
        }

        if ( isPrime(x-i)){
            l1.add(x-i);
        }
        else{
            computePrimeFactors(x-i);
        }
    }

    public static Boolean isPrime(int k){
//        if (k ==1 ){
//            return true;
//        }
        for(int i=2; i<k ; i++){
            if (k%i ==0 ){
                return false;
            }
        }
        return true;
    }

}
