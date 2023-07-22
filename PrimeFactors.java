import java.util.*;
public class PrimeFactors{
    public static boolean primeFactors(int n){
        for(int i=2; i*i<=n; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        ArrayList<Integer> al= new ArrayList<>();
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=1; i*i<=n;i++){
            al.add(i);
            al.add(n/i);
        }
        Collections.sort(al);
        System.out.println(al);
        for(int i = 1; i < al.size(); i++){
            if(primeFactors(al.get(i))){
                System.out.println(al.get(i));
            }
        }
        sc.close();
    }
}