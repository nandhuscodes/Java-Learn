import java.util.Scanner;
public class NEvenNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 1; i <= n; i++){
            if(i%2==0){
                System.out.println(i+" is Even");
            }else{
                System.out.println(i+" is Odd");
            }
        }
        scanner.close();
    }
}
