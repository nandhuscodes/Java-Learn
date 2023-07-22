import java.util.*;
public class TotalSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = 1700, B = 1500, C = 1300;
        long basic = scanner.nextLong();
        char c = scanner.next().charAt(0);
        double hra = (double)(basic)*(0.2);
        double da = (double)(basic)*(0.5);
        double pf = (double)(basic)*(0.11);
        if(c == 'A'){
            pf = A - pf;
        }else if(c == 'B'){
            pf = B - pf;
        }else{
            pf = C - pf;
        }
        System.out.println(basic+hra+da+pf);
        scanner.close();
    }
}
