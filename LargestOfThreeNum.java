import java.util.Scanner;
public class LargestOfThreeNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();
        if(a>=b && a>=c){
            System.out.println(a+" is the largest number");
        }else if(b>=c && b>=a){
            System.out.println(b+" is the largest number");
        }else{
            System.out.println(c+" is the largest number");
        }
        scanner.close();
    }
}
