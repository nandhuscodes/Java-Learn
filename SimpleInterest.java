import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float principal = scanner.nextFloat(), rate = scanner.nextFloat(), noOfYears = scanner.nextFloat();
        System.out.println("Simple Interest: "+ ((principal*rate*noOfYears)/100));
        scanner.close();
    }
}
