import java.util.*;
public class IsAlpha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);
        if((ch>= 97 && ch<=122) || (ch >= 65 && ch <= 90)){
            System.out.println(ch+" is alphabet");
        }else{
            System.out.println(ch+" is not alphabet");
        }
        scanner.close();
    }
}
