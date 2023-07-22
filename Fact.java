import java.util.*;
class Fact{
    static void countFactor(int n){
        int count = 0, loop = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 1; i*i <= n; i++){
            loop++;
            if(n%i == 0){
                if(n/i == i){
                    arr.add(i);
                    count++;
                }else{
                    arr.add(n/i);
                    arr.add(i);
                    count+=2;
                }
            }
        }
        Collections.sort(arr);
        System.out.println("Factors: "+arr);
        System.out.println("Loop count: "+loop);
        System.out.println("Count: "+count);
    }
    public static void main(String[] args){
        countFactor(24);
    }
}