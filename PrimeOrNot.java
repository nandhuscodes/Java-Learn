import java.util.Scanner;
public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean isPrime = true;
        for(int i = 2; i*i<=n; i++){
            if(n%i==0){
                isPrime = false;
            }
        }
        if(isPrime){
            System.out.println(n+" is Prime");
        }else{
            System.out.println(n+" is not Prime");
        }
        scanner.close();
    }
}
