import java.util.Scanner;
class GCD{
    static int gcdOfTwoNum(int a, int b){
        if(a == 0){
            return b;
        }
        return gcdOfTwoNum(b%a, a);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int gcd = gcdOfTwoNum(scanner.nextInt(), scanner.nextInt());
        System.out.println(gcd);
        scanner.close();
    }
}