import java.util.Scanner;
public class ValidTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();
        if(a+b>c || b+c>a || c+a>b){
            System.out.println("Valid Triangle");
        }else{
            System.out.println("Invalid Triangle");
        }
        scanner.close();
    }
}
