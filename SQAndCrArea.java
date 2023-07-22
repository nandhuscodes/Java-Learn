public class SQAndCrArea {
    public static void main(String[] args) {
        int a = 4, sq = 0;
        double pi = 3.14, cr = 0;
        for(int i = a; i > 0; i--){
            sq += a;
        }
        for(int i = sq; i > 0; i--){
            cr += pi;
        }
        System.out.println(sq+" "+cr);
    }
}
