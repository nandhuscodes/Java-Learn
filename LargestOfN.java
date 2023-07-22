import java.util.Scanner;
public class LargestOfN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), l = Integer.MIN_VALUE;
        int[] numbers = new int[n];
        for(int i = 0; i < n; i++){
            numbers[i] = scanner.nextInt();
            if(numbers[i] > l){
                l = numbers[i];
            }
        }
        System.out.println(l+" is the largest");
        scanner.close();
    }
}
