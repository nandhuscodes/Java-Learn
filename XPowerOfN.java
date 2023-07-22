import java.util.*;
public class XPowerOfN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt(), n = scanner.nextInt(), pow = 1;
        for(int i = 0; i < n; i++){
            pow *= x;
        }
        System.out.println("Math.pow("+x+","+n+"): "+ pow);
        scanner.close();
    }
}
