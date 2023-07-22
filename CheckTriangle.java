import java.util.Scanner;
public class CheckTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();
        if(a == b && a == c && b==c){
            System.out.println("It is a equilateral triangle");
        }else if(a != b && a != c && b != c){
            System.out.println("It is a isosceles triangle");
        }else{
            System.out.println("It is a scalene triangle");
        }
        scanner.close();
    }
}
