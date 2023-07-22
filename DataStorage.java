import java.util.*;
public class DataStorage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dec = scanner.nextInt();
        System.out.println("Decimal to Binary: "+dec+" -> "+ Integer.toBinaryString(dec));
        String bin = scanner.next();
        System.out.println("Binary to Decimal: "+bin+" -> "+ Integer.parseInt(bin, 2));
        char ch = scanner.next().charAt(0);
        System.out.println("Storage location of "+ch+": "+(int)ch);
        scanner.close();
    }
}
