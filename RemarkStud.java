import java.util.*;
public class RemarkStud {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mark = scanner.nextInt();
        if(mark > 75 && mark <= 100){
            System.out.println("Distinction");
        }else if(mark > 50 && mark <= 75){
            System.out.println("Average");
        }else if(mark >= 35 && mark <= 50){
            System.out.println("Below Average");
        }else{
            System.out.println("Fail");
        }
        scanner.close();
    }
}
