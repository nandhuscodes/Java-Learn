import java.util.Scanner;
public class AverageOfThreeNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println((scanner.nextInt()+scanner.nextInt()+scanner.nextInt())/3);
        scanner.close();
    }
}
