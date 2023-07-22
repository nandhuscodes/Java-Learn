public class LogBase2 {
    public static void main(String[] args){
        double x = 100, base = 2, log = 0;
        while(x>=base){
            log+=1+((x%base)/10);
            x/=base;
        }
        System.out.println(log);
    }
}
