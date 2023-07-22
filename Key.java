import java.util.*;
public class Key {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt(), count = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        for (int i = key; i < n-1; i++){
            arr[i] = arr[i+1];
        }
        for (int i = 0; i < n-1; i++){
            System.out.println(arr[i]);
            if(arr[i] == 1){
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
