import java.util.Scanner;
public class Print1ToN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 1; i <= n; i++){
            System.out.println(i);
        }
        scanner.close();
    }
}