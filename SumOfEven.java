import java.util.Scanner;
public class SumOfEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), sum = 0;
        while (n > 0){
            int rem = n%10;
            n/=10;
            if(rem%2 == 0){
                sum+=rem;
            }
        }
        System.out.println(sum);
        scanner.close();
    }
}
