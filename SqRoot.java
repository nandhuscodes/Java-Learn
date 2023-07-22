public class SqRoot {
    public static void squareRoot(int n){
        int result=0;
        for(int i=1; i*i<=n;i++){
            System.out.println("Loop Number:"+ i);
            if(i*i<=n){
                result =i;
            }
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
       squareRoot(105);
    }
}
