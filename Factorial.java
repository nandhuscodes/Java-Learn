import java.util.Scanner;
public class Factorial {
    static int factorial(int n){
        if(n == 1){
            return 1;
        }
        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), fact = factorial(n);
        System.out.println(fact);
        scanner.close();
    }
}
