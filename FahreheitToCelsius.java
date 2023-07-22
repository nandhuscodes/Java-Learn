import java.util.*;
public class FahreheitToCelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int F = scanner.nextInt();
        System.out.println(((F-32)/9)*5);
        scanner.close();
    }
}
