import java.util.*;
public class RectangularArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt(), x2 = scanner.nextInt(), y1 = scanner.nextInt(), y2= scanner.nextInt();
        System.out.println(Math.abs(x2-x1)*Math.abs(y2-y1));
        scanner.close();
    }
}
